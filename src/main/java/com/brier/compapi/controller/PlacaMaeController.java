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

import com.brier.compapi.model.PlacaMae;
import com.brier.compapi.service.PlacaMaeService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/placamae")
public class PlacaMaeController {
	
	@Autowired
	PlacaMaeService placaMaeService;
	
//	@GetMapping()
//	public Iterable<PlacaMae> findAll() {
//		return this.placaMaeService.findAll();
//	}
	
	@GetMapping()
	public Iterable<PlacaMae> findAllByOrderByPrecoAsc() {
		return this.placaMaeService.findAllByOrderByPrecoAsc();
	}
	
	@GetMapping(path = "/{id}")
	public PlacaMae findOne(@PathVariable Long id) {
		return this.placaMaeService.findById(id);
	}
	
	@PostMapping
	public PlacaMae save(@RequestBody PlacaMae placaMae) {
		return this.placaMaeService.save(placaMae);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.placaMaeService.delete(id);
	}

}
