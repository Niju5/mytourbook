package com.spring.mytourbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.spring.mytourbook.entities.Booking;
import com.spring.mytourbook.service.*;

@RestController
@RequestMapping("/api")

public class BookingController {
@Autowired
IBookingService bservice;

@PostMapping("/booking")
public Booking doBooking(@RequestBody Booking booking) {
	return bservice.makeBooking(booking);
}

@DeleteMapping("/cbooking/{bookingId}")

public  String cancelBooking(@PathVariable Long bookingId){

 

return bservice.cancelBooking(bookingId);

}
@GetMapping("/vbooking/{bookingId}")

public  Optional<Booking> viewBooking(@PathVariable Long bookingId){

return bservice.viewBooking(bookingId);

}
@GetMapping("/vibooking")

public  List<Booking> viewAllBookings(){

return bservice.viewAllBookings();

}
}
