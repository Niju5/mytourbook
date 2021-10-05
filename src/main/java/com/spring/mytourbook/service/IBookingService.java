package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import com.spring.mytourbook.entities.Booking;

public interface IBookingService {
Booking makeBooking(Booking booking);
String cancelBooking(Long bookingId);
Optional<Booking> viewBooking(Long bookingId);
List<Booking> viewAllBookings();
}
