package com.example.bootApp.repository;
import java.util.List;

import com.example.bootApp.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}