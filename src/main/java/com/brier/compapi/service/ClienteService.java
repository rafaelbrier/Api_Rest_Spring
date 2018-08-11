package com.brier.compapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brier.compapi.dao.ClienteDAO;
import com.brier.compapi.model.Cliente;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDAO clienteDAO;

	public Iterable<Cliente> findAll() {
		return this.clienteDAO.findAll();
	}
	
	public Cliente findById(Long id) {
		return this.clienteDAO.findById(id).orElse(null);
	}
	
	public Cliente save(Cliente cliente) {
		return this.clienteDAO.save(cliente);
	}
	
	public void delete(Long id) {
		this.clienteDAO.deleteById(id);
	}
}
