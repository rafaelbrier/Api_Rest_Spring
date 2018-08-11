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

import com.brier.compapi.model.Compra;
import com.brier.compapi.service.CompraService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	CompraService compraService;

	@GetMapping()
	public Iterable<Compra> findAll() {
		return this.compraService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Compra findOne(@PathVariable Long id) {
		return this.compraService.findById(id);
	}
	
	@PostMapping
	public Compra save(@RequestBody Compra compras) {
		return this.compraService.save(compras);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.compraService.delete(id);
	}

}
