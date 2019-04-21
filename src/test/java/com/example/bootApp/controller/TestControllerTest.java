package com.example.bootApp.controller;

import com.example.bootApp.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

	@Mock
	private TestService testService;

	@Test
	public void getStrings() throws Exception {

	}

}