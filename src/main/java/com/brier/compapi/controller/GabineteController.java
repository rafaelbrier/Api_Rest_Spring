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

import com.brier.compapi.model.Gabinete;
import com.brier.compapi.service.GabineteService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/gabinete")
public class GabineteController {
	
	@Autowired
	GabineteService gabineteService;
	
//	@GetMapping()
//	public Iterable<Gabinete> findAll() {
//		return this.gabineteService.findAll();
//	}
	
	@GetMapping()
	public Iterable<Gabinete> findAllByOrderByPrecoAsc() {
		return this.gabineteService.findAllByOrderByPrecoAsc();
	}
	
	@GetMapping(path = "/{id}")
	public Gabinete findOne(@PathVariable Long id) {
		return this.gabineteService.findById(id);
	}
	
	@PostMapping
	public Gabinete save(@RequestBody Gabinete Gabinete) {
		return this.gabineteService.save(Gabinete);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.gabineteService.delete(id);
	}

}
