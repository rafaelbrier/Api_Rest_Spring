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

import com.brier.compapi.model.Memoria;
import com.brier.compapi.service.MemoriaService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/memoria")
public class MemoriaController {
	
	@Autowired
	MemoriaService memoriaService;
	
//	@GetMapping()
//	public Iterable<Memoria> findAll() {
//		return this.memoriaService.findAll();
//	}
	
	@GetMapping()
	public Iterable<Memoria> findAllByOrderByPrecoAsc() {
		return this.memoriaService.findAllByOrderByPrecoAsc();
	}
	
	@GetMapping(path = "/{id}")
	public Memoria findOne(@PathVariable Long id) {
		return this.memoriaService.findById(id);
	}
	
	@PostMapping
	public Memoria save(@RequestBody Memoria Memoria) {
		return this.memoriaService.save(Memoria);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.memoriaService.delete(id);
	}


}
