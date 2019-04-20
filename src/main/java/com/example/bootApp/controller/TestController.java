package com.example.bootApp.controller;

import com.example.bootApp.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class TestController {

	private TestService testService;

	@Autowired
	public TestController(TestService testService) {
		this.testService = testService;
	}

	@GetMapping("/strings")
	public List<String> getStrings() {
		return testService.getStrings();
	}
}
