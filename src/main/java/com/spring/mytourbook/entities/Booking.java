package com.spring.mytourbook.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity(name="BOOKING")
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BOOKING_ID")
		Long bookingId;
		String bookingType;
		String description;
		String bookingTitle;
		LocalDate submitDate;
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="PACKAGE_ID")
	    private TravelPackage travelPackage;
		
		public Long getBookingId() {
			return bookingId;
		}
		public void setBookingId(Long bookingId) {
			this.bookingId = bookingId;
		}
		public String getBookingType() {
			return bookingType;
		}
		public void setBookingType(String bookingType) {
			this.bookingType = bookingType;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getBookingTitle() {
			return bookingTitle;
		}
		public void setBookingTitle(String bookingTitle) {
			this.bookingTitle = bookingTitle;
		}
		public LocalDate getSubmitDate() {
			return submitDate;
		}
		public void setSubmitDate(LocalDate submitDate) {
			this.submitDate = submitDate;
		}
		public Booking(Long bookingId, String bookingType, String description, String bookingTitle, LocalDate submitDate,TravelPackage travelPackage) {
			super();
			this.bookingId = bookingId;
			this.bookingType = bookingType;
			this.description = description;
			this.bookingTitle = bookingTitle;
			this.submitDate = submitDate;
			this.travelPackage = travelPackage;
		}
		public TravelPackage getTravelPackage() {
			return travelPackage;
		}
		public void setTravelPackage(TravelPackage travelPackage) {
			this.travelPackage = travelPackage;
		}
		public Booking() {
			super();
		}
		
}
