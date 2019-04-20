package com.example.bootApp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class TestService {

	public List<String> getStrings() {
		log.info("call getStrings");
		return Arrays.asList("string1", "string2", "string3", "string4");
	}
}
