package com.example.bootapp.repository;

import com.example.bootapp.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}