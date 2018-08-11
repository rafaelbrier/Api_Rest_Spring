package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.GabineteDAO;
import com.brier.compapi.model.Gabinete;

@Service
public class GabineteService {
	
	@Autowired
	GabineteDAO gabineteDAO;
	
	public Iterable<Gabinete> findAll() {
		return this.gabineteDAO.findAll();
	}
	
	public Iterable<Gabinete> findAllByOrderByPrecoAsc(){
		return this.gabineteDAO.findAllByOrderByPrecoAsc();
	}
	
	public Gabinete findById(Long id) {
		return this.gabineteDAO.findById(id).orElse(null);
	}
	
	public Gabinete save(Gabinete gabinete) {
		return this.gabineteDAO.save(gabinete);
	}
	
	public void delete(Long id) {
		this.gabineteDAO.deleteById(id);
	}

}
