package com.github.acnaweb.study_apir.dto;

import java.math.BigDecimal;

import com.github.acnaweb.study_apir.model.Product;

public class ProductRequestCreate {    
    private String nome;

    public Product toModel(){
        BigDecimal VALOR_PADRAO = new BigDecimal(2000);
        Product product = new Product();
        product.setValor(VALOR_PADRAO);
        product.setNome(this.nome);
        return product;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }     
    
    

}
