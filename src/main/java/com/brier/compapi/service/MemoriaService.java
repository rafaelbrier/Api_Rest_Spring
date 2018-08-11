package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.MemoriaDAO;
import com.brier.compapi.model.Memoria;

@Service
public class MemoriaService {
	
	@Autowired
	MemoriaDAO memoriaDAO;
	
	public Iterable<Memoria> findAll() {
		return this.memoriaDAO.findAll();
	}
	
	public Iterable<Memoria> findAllByOrderByPrecoAsc(){
		return this.memoriaDAO.findAllByOrderByPrecoAsc();
	}
	
	public Memoria findById(Long id) {
		return this.memoriaDAO.findById(id).orElse(null);
	}
	
	public Memoria save(Memoria memoria) {
		return this.memoriaDAO.save(memoria);
	}
	
	public void delete(Long id) {
		this.memoriaDAO.deleteById(id);
	}

}
