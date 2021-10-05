package com.spring.mytourbook.entities;

import java.util.List;

import javax.persistence.*;
@Entity(name="ADMIN")
public class Admin {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "ADMIN_ID")
	    private int adminId;

	    @Column(name = "ADMINNAME")
	    private String adminName;

	    @Column(name = "PASSWORD")
	    private String password;
	    
	    @Column(name = "EMAIL")
	    private String email;
	    
	    @Column(name = "MOBILE")
	    private String mobile;

	    @OneToMany(cascade=CascadeType.ALL)
	    
	    @JoinColumn(name="ADMIN_ID")
	    
	    private List<Report> report;
	    
	    public List<Report> getReport() {
			return report;
		}
		public void setReport(List<Report> report) {
			this.report = report;
		}
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
		@OneToOne(cascade=CascadeType.ALL)
	    
	    @JoinColumn(name="USER_ID")
	    
	    private User user;
		public Admin() {
			
		}
	    
	    
	
	
	public Admin(int adminId, String adminName, String password, String email, String mobile, List<Report> report,
				User user) {
			super();
			this.adminId = adminId;
			this.adminName = adminName;
			this.password = password;
			this.email = email;
			this.mobile = mobile;
			this.report = report;
			this.user = user;
		}
	/*int adminId;
	String adminName;
	String password;
	String email;
	String mobile;*/
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
