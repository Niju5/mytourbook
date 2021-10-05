package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mytourbook.entities.Route;
import com.spring.mytourbook.entities.Travels;
import com.spring.mytourbook.repository.IRouteRepository;
import com.spring.mytourbook.repository.ITravelsRepository;

@Service

public class TravelsServiceImpl implements ITravelsService{
	@Autowired
	ITravelsRepository repo;
	@Override
	public Travels addTravels(Travels travels) {
		// TODO Auto-generated method stub
		System.out.println("Successfully added");
		return repo.save(travels);
	}

	@Override
	public Travels updateTravels(Travels travels) {
		// TODO Auto-generated method stub
		 Optional<Travels> a = repo.findById(travels.getTravelsId());
			if (a.isPresent()) {
				repo.saveAndFlush(travels);
			}
			return travels;
	}

	@Override
	public String removeTravels(Long travelsId) {
		// TODO Auto-generated method stub
		 repo.deleteById(travelsId);
		 return "Deleted successfully";
	}

	@Override
	public Optional<Travels> searchTravels(Long travelsId) {
		// TODO Auto-generated method stub
		return repo.findById(travelsId);
	}

	@Override
	public List<Travels> viewTravels() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
