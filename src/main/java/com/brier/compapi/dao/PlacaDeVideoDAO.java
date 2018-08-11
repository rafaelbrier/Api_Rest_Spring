package com.brier.compapi.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brier.compapi.model.PlacaDeVideo;

public interface PlacaDeVideoDAO extends CrudRepository<PlacaDeVideo, Long> {
	
	public List<PlacaDeVideo> findAllByOrderByPrecoAsc();

}
