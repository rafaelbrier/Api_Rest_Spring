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

import com.brier.compapi.model.Processador;
import com.brier.compapi.service.ProcessadorService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/processador")
public class ProcessadorController {
	
	@Autowired
	ProcessadorService processadorService;
	
//	@GetMapping()
//	public Iterable<Processador> findAll() {
//		return this.processadorService.findAll();
//	}
	
	@GetMapping()
	public Iterable<Processador> findAllByOrderByPrecoAsc() {
		return this.processadorService.findAllByOrderByPrecoAsc();
	}
	
	
	@GetMapping(path = "/{id}")
	public Processador findOne(@PathVariable Long id) {
		return this.processadorService.findById(id);
	}
	
	@PostMapping
	public Processador save(@RequestBody Processador processador) {
		return this.processadorService.save(processador);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.processadorService.delete(id);
	}

}
