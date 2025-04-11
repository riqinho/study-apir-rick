package com.github.acnaweb.study_apir.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.study_apir.dto.PedidoRequestCreate;
import com.github.acnaweb.study_apir.dto.PedidoRequestUpdate;
import com.github.acnaweb.study_apir.dto.ProdutoRequestUpdate;
import com.github.acnaweb.study_apir.model.Pedido;
import com.github.acnaweb.study_apir.model.Produto;
import com.github.acnaweb.study_apir.repository.PedidoRepository;

@Service
public class PedidoService {

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

    // public Optional<Pedido> gerPedidoById(Long id) {        
    //     return pedidoRepository.findById(id);
    // }

    // public List<Pedido> getAll() {
    //     return pedidoRepository.findAll();
    // }

    // public boolean deletePedido(Long id) { 
    //     if (pedidoRepository.existsById(id)) {
    //         pedidoRepository.deleteById(id);
    //         return true;
    //     }

    //     return false;     
    // }



}
