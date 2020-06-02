package com.training.bankdetails.bankingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bankdetails.bankingapp.model.Customers;
import com.training.bankdetails.bankingapp.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	
	public void addCustomer(Customers customer) {
		repository.save(customer);
		
	}
	public List<Customers> findAllCustomers(){
		return repository.findAll();
	}
	
	public Optional<Customers> findCustomer(int customerID){
		return repository.findById(customerID);
	}
	
	public void deleteCustomer(int customerID) {
		repository.deleteById(customerID);
	}

}
