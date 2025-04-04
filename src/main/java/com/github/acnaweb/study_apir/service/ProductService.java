package com.github.acnaweb.study_apir.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.acnaweb.study_apir.dto.ProductRequestCreate;
import com.github.acnaweb.study_apir.dto.ProductRequestUpdate;
import com.github.acnaweb.study_apir.model.Product;
import com.github.acnaweb.study_apir.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(ProductRequestCreate dto) {  
        return productRepository.save(dto.toModel());
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Optional<Product> updateProduct(Long id, ProductRequestUpdate dto) {
        return productRepository.findById(id)
                .map(p -> productRepository.save(dto.toModel(p)));
    }

    public boolean deleteProduct(Long id) {
        if(productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
