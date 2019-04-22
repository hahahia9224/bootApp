package com.example.bootapp.configuration.service;

import com.example.bootapp.configuration.model.Test;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class TestService {

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
}
