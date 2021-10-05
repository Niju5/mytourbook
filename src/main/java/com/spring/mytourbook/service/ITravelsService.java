package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import com.spring.mytourbook.entities.Travels;

public interface ITravelsService {
	public Travels addTravels(Travels travels);
	public Travels updateTravels(Travels travels);
	public Optional<Travels> searchTravels(Long travelsId);
	public List<Travels> viewTravels();
	public String removeTravels(Long travelsId);

}
