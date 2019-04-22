package com.example.bootapp.configuration.repository;

import com.example.bootapp.configuration.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}