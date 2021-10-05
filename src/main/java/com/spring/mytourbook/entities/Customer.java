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
@Entity(name="CUSTOMER")
public class Customer {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "CUSTOMER_ID")
	    private Long customerId;

	    @Column(name = "CUSTOMERNAME")
	    private String customerName;

	    
	    
	    
	    @Column(name = "ADDRESS")
	    private String address;
	    
	    @Column(name = "EMAIL")
	    private String email;
	    
	    @Column(name = "MOBILE")
	    private String mobileNo;

	    @OneToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name="USER_ID")
	    private User user;
	    
	    
	     public Customer() {
			super();
		}
		String customerPassword;
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    
	    @JoinColumn(name="FEEDBACK_ID")
	    
	    private Feedback feedback;
	
	public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		public Feedback getFeedback() {
			return feedback;
		}
		public void setFeedback(Feedback feedback) {
			this.feedback = feedback;
		}
	public Customer(Long customerId, String customerName, String address, String email, String mobileNo, User user,
				String customerPassword, Feedback feedback) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.address = address;
			this.email = email;
			this.mobileNo = mobileNo;
			this.user = user;
			this.customerPassword = customerPassword;
			this.feedback = feedback;
		}
	/*int customerId;
	String customerName;
	String customerPassword;
	String address;
	String mobileNo;
	String email;*/
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
