package com.spring.mytourbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.mytourbook.entities.Customer;
import com.spring.mytourbook.service.*;

@RestController
@RequestMapping("/api")

public class CustomerController {
	@Autowired
	ICustomerService cservice;
	@PostMapping("/acustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return cservice.addCustomer(customer);
	}
	@PutMapping("/ucustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return cservice.updateCustomer(customer);
	}
	@DeleteMapping("/dcustomer/{customerId}")
	public String deleteCustomer(@PathVariable Long customerId) {
		return cservice.deleteCustomer(customerId);
	}
	@GetMapping("/vcustomer/{customerId}")
	public Optional<Customer> viewCustomer(@PathVariable Long customerId){
		return cservice.viewCustomer(customerId);
		
	}
	@GetMapping("/vicustomer")
	public List<Customer> viewAllCustomer(){
		return cservice.viewAllCustomer();
		
	}
/*	@GetMapping("/viewcustomerlist")
	public List<Customer> viewCustomerList(int customerId){
		return cservice.viewCustomerList(customerId);
		
	}*/
	
}
