package com.example.bootapp.service;

import com.example.bootapp.model.Customer;
import com.example.bootapp.model.Test;
import com.example.bootapp.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class TestService {

	private TestRepository testRepository;

	@Autowired
	public TestService(TestRepository testRepository) {
		this.testRepository = testRepository;
	}

	public List<Test> getStrings() {
		log.info("call getStrings");
		Test a = new Test("abc", "cde", "efg");
		a.setName("name!!");
		log.debug(a.toString());

		return Arrays.asList(a,
			new Test("1", "2", "3"),
			new Test("1", "2", "3"),
			new Test("1", "2", "3"),
			new Test("1", "2", "3"),
			new Test("1", "2", "3")
			);
	}

	public void insertValues() {
		testRepository.save(new Customer("AA","BB"));
		testRepository.save(new Customer("AA1","BB1"));
		testRepository.save(new Customer("A1A","B1B"));
	}

	public List<Customer> GetCustomersByLastName(String s) {
		return testRepository.findByLastName(s);
	}

}
