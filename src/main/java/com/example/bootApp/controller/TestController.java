package com.example.bootApp.controller;

import com.example.bootApp.model.Test;
import com.example.bootApp.service.MyService;
import com.example.bootApp.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class TestController {

	private TestService testService;
	private MyService myService;
	@Autowired
	public TestController(TestService testService, MyService myService) {

		this.testService = testService;
		this.myService=myService;
	}

	@GetMapping("/strings")
	public List<Test> getStrings() {
		return testService.getStrings();
	}

	@GetMapping("/insert")
	public String AddValue(){
		myService.InsertValues();
		return "End";
	}

	@RequestMapping(value = "/Get", method= RequestMethod.GET)
	public String AddValue(@RequestParam("val") String val){
		return myService.GetByLast(val).toString();
	}

}
