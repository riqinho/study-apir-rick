package com.github.acnaweb.study_apir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.acnaweb.study_apir.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    public List<Pedido> findByStatus(String status); // Método para buscar pedidos por status
}
