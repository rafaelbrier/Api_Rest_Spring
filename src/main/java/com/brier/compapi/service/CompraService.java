package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.CompraDAO;
import com.brier.compapi.model.Compra;

@Service
public class CompraService {
	
	@Autowired
	CompraDAO comprasDAO;

	public Iterable<Compra> findAll() {
		return this.comprasDAO.findAll();
	}
	
	public Compra findById(Long id) {
		return this.comprasDAO.findById(id).orElse(null);
	}
	
	public Compra save(Compra compras) {
		return this.comprasDAO.save(compras);
	}
	
	public void delete(Long id) {
		this.comprasDAO.deleteById(id);
	}
}
