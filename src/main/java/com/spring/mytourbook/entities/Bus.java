package com.spring.mytourbook.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity(name="BUS")

public class Bus {
	
		
		   
	
	 public Bus(int busId, String busType, String busNumber, int capacity, Route route,
			TicketDetails ticketDetails) {
		super();
		this.busId = busId;
		this.busType = busType;
		this.busNumber = busNumber;
		this.capacity = capacity;
		this.route = route;
		this.ticketDetails = ticketDetails;
	}
	public Bus() {
		super();
	}
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "BUS_ID")
	int busId;
	String busType;
	String busNumber;
	int capacity;
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	 @OneToOne(cascade=CascadeType.ALL)

	 @JoinColumn(name = "ROUTE_ID", referencedColumnName = "ROUTE_ID", insertable = false, updatable = false)
	    private Route route;
	
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public TicketDetails getTicketDetails() {
		return ticketDetails;
	}
	public void setTicketDetails(TicketDetails ticketDetails) {
		this.ticketDetails = ticketDetails;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "TICKET_ID", referencedColumnName = "TICKET_ID", insertable = false, updatable = false)
	    private TicketDetails ticketDetails;
	  
	
}
