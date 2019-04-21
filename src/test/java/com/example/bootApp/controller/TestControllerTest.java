package com.example.bootApp.controller;

import com.example.bootApp.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TestControllerTest {

	@Mock
	private TestService testService;

	@Test
	public void getStrings() throws Exception {
		when(testService.getStrings()).
			thenReturn(
				Arrays.asList(new com.example.bootApp.model.Test("a", "b", "c"),
					new com.example.bootApp.model.Test("a", "b", "c"),
					new com.example.bootApp.model.Test("a", "b", "c")
			)
		);
		assertTrue(testService.getStrings().size() == 3);

	}

}