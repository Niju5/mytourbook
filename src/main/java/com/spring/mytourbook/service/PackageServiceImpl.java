package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mytourbook.entities.TravelPackage;
import com.spring.mytourbook.repository.IFeedbackRepository;
import com.spring.mytourbook.repository.IPackageRepository;

@Service

public class PackageServiceImpl implements IPackageService{
	@Autowired
    IPackageRepository repo;
	@Override
	public TravelPackage addPackage(TravelPackage travelpackage) {
		// TODO Auto-generated method stub
		System.out.println("Successfully saved");

		return repo.save(travelpackage);
	}

	@Override
	public TravelPackage deletePackage(Long packageId) {
		// TODO Auto-generated method stub
		
		System.out.println("Successfully deleted"+packageId);

		 repo.deleteById(packageId);
		 return null;
	}

	
	@Override
	public Optional<TravelPackage> searchPackage(Long packageId) {
		// TODO Auto-generated method stub
		return repo.findById(packageId);
	}

	@Override
	public List<TravelPackage> viewAllPackages() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
