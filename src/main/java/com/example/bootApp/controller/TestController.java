package com.example.bootApp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class TestController {

	@GetMapping("/strings")
	public List<String> getStrings() {
		return Arrays.asList("string1", "string2", "string3", "string4");
	}
}
