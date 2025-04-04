package com.github.acnaweb.study_apir.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.study_apir.dto.ProdutoRequestCreate;
import com.github.acnaweb.study_apir.dto.ProdutoRequestUpdate;

import com.github.acnaweb.study_apir.model.Produto;
import com.github.acnaweb.study_apir.repository.ProdutoRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProdutoRepository productRepository;

    public Produto createProduct(ProdutoRequestCreate dto) {
        return productRepository.save(dto.toModel());
    }

    public Optional<Produto> updateProduct(
            Long id, ProdutoRequestUpdate dto) {

        return productRepository.findById(id)
            .map(p -> productRepository.save(dto.toModel(p)));
    }

    public Optional<Produto> getProductById(Long id) {        
        return productRepository.findById(id);
    }

    public List<Produto> getAll() {
        return productRepository.findAll();
    }

    public boolean deleteProduct(Long id) { 
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }

        return false;     
    }
}
