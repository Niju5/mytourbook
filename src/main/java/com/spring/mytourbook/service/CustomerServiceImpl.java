package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mytourbook.entities.Customer;
import com.spring.mytourbook.repository.ICustomerRepository;

@Service

public class CustomerServiceImpl implements ICustomerService{
	@Autowired
    ICustomerRepository repo;
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		  System.out.println("Successfully saved");
		  return repo.save(customer);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 
		  Optional<Customer> a = repo.findById(customer.getCustomerId());
			if (a.isPresent()) {
				repo.saveAndFlush(customer);
			}
			return customer;
	}

	@Override
	public String deleteCustomer(Long customerId) {
		// TODO Auto-generated method stub
		
		   repo.deleteById(customerId);
		   return "Successfully deleted";
	}

	
	@Override
	
	public Optional<Customer> viewCustomer(Long customerId) {
		// TODO Auto-generated method stub
		System.out.println("Successfully updated");
		  return repo.findById(customerId);
		
	}

	@Override
	
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
	/*@Override
	public List<Customer> viewCustomerList(long customerId) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}*/

	

}
