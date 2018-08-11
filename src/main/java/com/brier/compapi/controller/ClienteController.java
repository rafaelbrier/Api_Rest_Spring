package com.brier.compapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brier.compapi.model.Cliente;
import com.brier.compapi.service.ClienteService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;

	@GetMapping()
	public Iterable<Cliente> findAll() {
		return this.clienteService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Cliente findOne(@PathVariable Long id) {
		return this.clienteService.findById(id);
	}
	
	@PostMapping
	public Cliente save(@RequestBody Cliente cliente) {
		return this.clienteService.save(cliente);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.clienteService.delete(id);
	}
}
