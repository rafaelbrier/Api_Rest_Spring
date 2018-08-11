package com.brier.compapi.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brier.compapi.model.Gabinete;


public interface GabineteDAO extends CrudRepository<Gabinete, Long> {
	
	public List<Gabinete> findAllByOrderByPrecoAsc();

}
