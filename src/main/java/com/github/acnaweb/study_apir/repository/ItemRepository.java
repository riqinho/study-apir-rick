package com.github.acnaweb.study_apir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.acnaweb.study_apir.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
