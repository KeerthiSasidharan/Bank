package com.training.bankdetails.bankingapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.training.bankdetails.bankingapp.model.Customers;

public interface CustomerRepository extends MongoRepository<Customers,Integer> {

}
