package com.spring.mytourbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mytourbook.entities.Travels;
import com.spring.mytourbook.service.ITravelsService;

@RestController
@RequestMapping("/api")

public class TravelsController {
	@Autowired
	ITravelsService tservice;
	@PostMapping("/atravels")
	public Travels addTravels(@RequestBody Travels travels) {
		return tservice.addTravels(travels);
	}
	@PutMapping("/utravels")
	public Travels updateTravels(@RequestBody Travels travels) {
		return tservice.updateTravels(travels);
	}
	@DeleteMapping("/rtravels/{travelsId}")
	public String removeTravels(@PathVariable Long travelsId) {
		return tservice.removeTravels(travelsId);
	}
	@GetMapping("/stravels/{travelsId}")
	public Optional<Travels> searchTravels(@PathVariable Long travelsId) {
		return tservice.searchTravels(travelsId);
	}
	@GetMapping("/vtravels")
	public List<Travels> viewTravels(){
		return tservice.viewTravels();}
}
