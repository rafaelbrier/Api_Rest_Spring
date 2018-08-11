package com.brier.compapi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brier.compapi.model.Memoria;

public interface MemoriaDAO extends CrudRepository<Memoria, Long> {

	public List<Memoria> findAllByOrderByPrecoAsc(); 
}
