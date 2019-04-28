package com.example.bootapp.controller;

import com.example.bootapp.model.Test;
import com.example.bootapp.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/test")
public class TestController {

	private TestService testService;

	@Autowired
	public TestController(TestService testService) {

		this.testService = testService;
	}

	@GetMapping("/strings")
	public List<Test> getStrings() {
		return testService.getStrings();
	}

	@GetMapping("/insert")
	public String addCustomers() {
		testService.insertValues();
		return "End";
	}

	@RequestMapping(value = "/get", method= RequestMethod.GET)
	public String getValue(@RequestParam("val") String val) {
		return testService.getCustomersByLastName(val).toString();
	}

}
