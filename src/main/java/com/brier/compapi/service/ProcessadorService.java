package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.ProcessadorDAO;
import com.brier.compapi.model.Processador;

@Service
public class ProcessadorService {
	
	@Autowired
	ProcessadorDAO processadorDAO;

	public Iterable<Processador> findAll() {
		return this.processadorDAO.findAll();
	}
	
	public Iterable<Processador> findAllByOrderByPrecoAsc() {
		return this.processadorDAO.findAllByOrderByPrecoAsc();
	}
	
	public Processador findById(Long id) {
		return this.processadorDAO.findById(id).orElse(null);
	}
	
	public Processador save(Processador processador) {
		return this.processadorDAO.save(processador);
	}
	
	public void delete(Long id) {
		this.processadorDAO.deleteById(id);
	}
	

}
