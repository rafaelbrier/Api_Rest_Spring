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

import com.brier.compapi.model.Fonte;
import com.brier.compapi.service.FonteService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/fonte")
public class FonteController {
	
	@Autowired
	FonteService fonteService;
	
//	@GetMapping()
//	public Iterable<Fonte> findAll() {
//		return this.fonteService.findAll();
//	}
	
	@GetMapping()
	public Iterable<Fonte> findAllByOrderByPrecoAsc() {
		return this.fonteService.findAllByOrderByPrecoAsc();
	}
	
	@GetMapping(path = "/{id}")
	public Fonte findOne(@PathVariable Long id) {
		return this.fonteService.findById(id);
	}
	
	@PostMapping
	public Fonte save(@RequestBody Fonte Fonte) {
		return this.fonteService.save(Fonte);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.fonteService.delete(id);
	}
}
