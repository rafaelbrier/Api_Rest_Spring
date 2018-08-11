package com.brier.compapi.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brier.compapi.model.PlacaMae;

public interface PlacaMaeDAO extends CrudRepository<PlacaMae, Long> {
	
	public List<PlacaMae> findAllByOrderByPrecoAsc();
}
