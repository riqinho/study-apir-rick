package com.github.acnaweb.study_apir.dto;

import java.math.BigDecimal;

import com.github.acnaweb.study_apir.model.Product;

public class ProductRequestUpdate {
    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Product toModel(Product product){
        product.setValor(this.valor);
        return product;
    }
}
