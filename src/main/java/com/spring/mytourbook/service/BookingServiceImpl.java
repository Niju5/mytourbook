package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mytourbook.entities.Booking;
import com.spring.mytourbook.repository.IBookingRepository;

@Service

public class BookingServiceImpl implements IBookingService{
	@Autowired
    IBookingRepository repo;
	@Override
	public Booking makeBooking(Booking booking) {
		// TODO Auto-generated method stub
		  System.out.println("Successfully saved");
		  return repo.save(booking);
		
	}

	@Override
	
	public String cancelBooking(Long bookingId) {
		// TODO Auto-generated method stub
		repo.deleteById(bookingId);
		return "Successfully deleted";
		
	}

	@Override
	
	public Optional<Booking> viewBooking(Long bookingId) {
		// TODO Auto-generated method stub
		return repo.findById(bookingId);
	}

	
	@Override
	
	public List<Booking> viewAllBookings() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
