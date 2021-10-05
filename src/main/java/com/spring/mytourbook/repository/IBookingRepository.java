package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.Booking;

public interface IBookingRepository extends JpaRepository<Booking,Long>{

}
