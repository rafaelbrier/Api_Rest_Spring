package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.FonteDAO;
import com.brier.compapi.model.Fonte;

@Service
public class FonteService {
	
	@Autowired
	FonteDAO fonteDAO;
	
	public Iterable<Fonte> findAll() {
		return this.fonteDAO.findAll();
	}
	
	public Iterable<Fonte> findAllByOrderByPrecoAsc(){
		return this.fonteDAO.findAllByOrderByPrecoAsc();
	}
	
	public Fonte findById(Long id) {
		return this.fonteDAO.findById(id).orElse(null);
	}
	
	public Fonte save(Fonte fonte) {
		return this.fonteDAO.save(fonte);
	}
	
	public void delete(Long id) {
		this.fonteDAO.deleteById(id);
	}

}
