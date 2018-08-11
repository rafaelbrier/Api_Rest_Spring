package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.PlacaMaeDAO;
import com.brier.compapi.model.PlacaMae;

@Service
public class PlacaMaeService {

	@Autowired
	PlacaMaeDAO placaMaeDAO;
	
	public Iterable<PlacaMae> findAll() {
		return this.placaMaeDAO.findAll();
	}
	
	public Iterable<PlacaMae> findAllByOrderByPrecoAsc(){
		return this.placaMaeDAO.findAllByOrderByPrecoAsc();
	}
	
	public PlacaMae findById(Long id) {
		return this.placaMaeDAO.findById(id).orElse(null);
	}
	
	public PlacaMae save(PlacaMae placaMae) {
		return this.placaMaeDAO.save(placaMae);
	}
	
	public void delete(Long id) {
		this.placaMaeDAO.deleteById(id);
	}
	
}
