package com.example.bootapp.repository;

import com.example.bootapp.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository <Customer, Long> {
	List<Customer> findByLastName(String lastName);
}
