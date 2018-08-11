package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.PlacaDeVideoDAO;
import com.brier.compapi.model.PlacaDeVideo;

@Service
public class PlacaDeVideoService {
	
	@Autowired
	PlacaDeVideoDAO placaDeVideoDAO;
	
	public Iterable<PlacaDeVideo> findAll() {
		return this.placaDeVideoDAO.findAll();
	}
	
	public Iterable<PlacaDeVideo> findAllByOrderByPrecoAsc(){
		return this.placaDeVideoDAO.findAllByOrderByPrecoAsc();
	}
	
	public PlacaDeVideo findById(Long id) {
		return this.placaDeVideoDAO.findById(id).orElse(null);
	}
	
	public PlacaDeVideo save(PlacaDeVideo placaDeVideo) {
		return this.placaDeVideoDAO.save(placaDeVideo);
	}
	
	public void delete(Long id) {
		this.placaDeVideoDAO.deleteById(id);
	}
	

}
