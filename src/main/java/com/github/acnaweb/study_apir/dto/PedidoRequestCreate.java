package com.github.acnaweb.study_apir.dto;

import java.util.List;

import com.github.acnaweb.study_apir.model.Pedido;
import com.github.acnaweb.study_apir.model.Produto;

public class PedidoRequestCreate {
    
    private List<ItemRequestCreate> item;

    public List<ItemRequestCreate> getItem() {
        return item;
    }

    public void setItem(List<ItemRequestCreate> item) {
        this.item = item;
    }
    
}
