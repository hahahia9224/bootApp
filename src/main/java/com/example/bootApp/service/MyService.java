package com.example.bootApp.service;

import com.example.bootApp.model.Customer;
import com.example.bootApp.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class MyService{
    private TestRepository testRepository;

    @Autowired
    public MyService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public String getTest(){

        return "ASDF";
    }

    public void InsertValues(){
        testRepository.save(new Customer("AA","BB"));
        testRepository.save(new Customer("AA1","BB1"));
        testRepository.save(new Customer("A1A","B1B"));
    }

    public List<Customer> GetByLast(String s){
        return testRepository.findByLastName(s);
    }
}