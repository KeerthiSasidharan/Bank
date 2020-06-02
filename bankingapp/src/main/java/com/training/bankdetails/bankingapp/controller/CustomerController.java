package com.training.bankdetails.bankingapp.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bankdetails.bankingapp.model.Customers;
import com.training.bankdetails.bankingapp.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping("/add")
	public String newCustomer(@RequestBody Customers customers) {
		service.addCustomer(customers);
		return "Customer added successfully";
	}
	
	@GetMapping("/getAll")
	public List<Customers> getAllCustomers(){
		return service.findAllCustomers();
	}
	
	@GetMapping("/{customerID}")
	public Optional<Customers> getCustomer(@PathVariable int customerID){
		return service.findCustomer(customerID);
	}
	
	@DeleteMapping("/delete/{customerID}")
	public String delCustomer(@PathVariable int customerID) {
		service.deleteCustomer(customerID);
		return "Customer deleted";
	}

}
