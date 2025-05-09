package com.github.acnaweb.study_apir.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.study_apir.dto.PedidoRequestCreate;
import com.github.acnaweb.study_apir.model.Item;
import com.github.acnaweb.study_apir.model.Pedido;
import com.github.acnaweb.study_apir.model.Produto;
import com.github.acnaweb.study_apir.repository.PedidoRepository;
import com.github.acnaweb.study_apir.repository.ProdutoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido create(PedidoRequestCreate dto) {
        Pedido pedido = new Pedido();

        pedido.setStatus("ABERTO");

        //mapear os itens de dto,getItems() para List<iItem> items
        List<Item> items = dto.getItem().stream()
            .map(i -> {
                Item item = new Item();

                Produto produto = produtoRepository.findById(i.getProduto_id())
                    .orElseThrow(() -> new RuntimeException("Produto não encontrado; " + i.getProduto_id()));

                item.setProduto(produto);
                item.setValor(i.getValor());
                item.setQuantidade(i.getQuantidade());
                item.setPedido(pedido); 

                return item;
            }
            ).collect(Collectors.toList());

        pedido.setItems(items);
        return pedidoRepository.save(pedido);
    }


    // @Autowired
    // private PedidoRepository pedidoRepository;

    // public Pedido createPedido(PedidoRequestCreate dto){
    //     return pedidoRepository.save(dto.toModel());
    // }

    // public Optional<Pedido> updatePedido(
    //         Long id, PedidoRequestUpdate dto) {

    //     return pedidoRepository.findById(id)
    //         .map(p -> pedidoRepository.save(dto.toModel(p)));
    // }

    public Optional<Pedido> gerPedidoById(Long id) {        
        return pedidoRepository.findById(id);
    }

    public List<Pedido> getAll() {
        return pedidoRepository.findAll();
    }

    public boolean deletePedido(Long id) { 
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
            return true;
        }

        return false;     
    }



}
