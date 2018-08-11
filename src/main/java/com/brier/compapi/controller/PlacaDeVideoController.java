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

import com.brier.compapi.model.PlacaDeVideo;
import com.brier.compapi.service.PlacaDeVideoService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/placadevideo")
public class PlacaDeVideoController {
	
	@Autowired
	PlacaDeVideoService placaDeVideoService;
	
//	@GetMapping()
//	public Iterable<PlacaDeVideo> findAll() {
//		return this.placaDeVideoService.findAll();
//	}
	
	@GetMapping()
	public Iterable<PlacaDeVideo> findAllByOrderByPrecoAsc() {
		return this.placaDeVideoService.findAllByOrderByPrecoAsc();
	}
	
	@GetMapping(path = "/{id}")
	public PlacaDeVideo findOne(@PathVariable Long id) {
		return this.placaDeVideoService.findById(id);
	}
	
	@PostMapping
	public PlacaDeVideo save(@RequestBody PlacaDeVideo placaDeVideo) {
		return this.placaDeVideoService.save(placaDeVideo);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id) {
		this.placaDeVideoService.delete(id);
	}


}
