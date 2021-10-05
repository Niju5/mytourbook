package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import com.spring.mytourbook.entities.Customer;

public interface ICustomerService {
public Customer addCustomer(Customer customer);
public Customer updateCustomer(Customer customer);
public String deleteCustomer(Long customerId);

//public List<Customer> viewCustomerList(int customer);
//Optional<Customer> viewCustomer(long customerId);
//List<Customer> viewAllCustomer();
//List<Customer> viewCustomerList(long customerId);
Optional<Customer> viewCustomer(Long customerId);
public List<Customer> viewAllCustomer();

}
