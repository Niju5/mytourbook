package com.spring.mytourbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="TICKETDETAILS")

public class TicketDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TICKET_ID")
	int ticketId;
	String status;
	
	public TicketDetails() {
		super();
	}
	public TicketDetails(String status, int ticketId) {
		super();
		this.status = status;
		this.ticketId = ticketId;
	}
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	
	
}
