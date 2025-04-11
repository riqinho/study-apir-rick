package com.github.acnaweb.study_apir.dto;

import java.util.List;

import com.github.acnaweb.study_apir.model.Pedido;
import com.github.acnaweb.study_apir.model.Produto;

public class PedidoResponse {
    private Long id;
    private String status;

    private List<ItemResponse> item;

    // public PedidoResponse toDto(Pedido pedido) {
    //     this.setId(pedido.getId());
    //     this.setStatus(pedido.getStatus());
    //     return this;
    // }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public List<ItemResponse> getItem() {
        return item;
    }

    public void setItem(List<ItemResponse> item) {
        this.item = item;
    }
}
