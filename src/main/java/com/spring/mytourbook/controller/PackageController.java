package com.spring.mytourbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mytourbook.entities.TravelPackage;
import com.spring.mytourbook.service.IPackageService;

@RestController
@RequestMapping("/api")

public class PackageController {
	@Autowired
	IPackageService pservice;
	@PostMapping("/apackage")
	public TravelPackage addPackage(@RequestBody TravelPackage travelPackage) {
		return pservice.addPackage(travelPackage);
	}
	@DeleteMapping("/dpackage")
	public TravelPackage deletePackage(@RequestBody Long packageId) {
		return pservice.deletePackage(packageId);
	}
	@GetMapping("/spackage/{packageId}")
	public Optional<TravelPackage> searchPackage(@PathVariable Long packageId) {
		return pservice.searchPackage(packageId);
	}
	@GetMapping("/vpackages")
	public List<TravelPackage> viewAllPackages(){
		return pservice.viewAllPackages();}
	
}
