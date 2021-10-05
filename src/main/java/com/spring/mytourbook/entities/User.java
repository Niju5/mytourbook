package com.spring.mytourbook.entities;

import java.util.List;

import javax.persistence.*;
@Entity(name="USER1")
public class User 
{
	
	
	public User(int userId, String userType,String userName, String password, List<Bus> bus) {
		super();
		this.userId = userId;
		this.userType = userType;
		this.password = password;
		this.userName=userName;
		this.bus = bus;
	}
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
	int userId;
	String userType;
	String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	String password;
	@OneToMany(cascade=CascadeType.ALL)
    
    @JoinColumn(name="USER_ID")
    
    private List<Bus> bus;
	public User() {
		super();
	}
	
	
	
}
