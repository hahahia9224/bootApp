package com.example.bootapp.controller;

import com.example.bootapp.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

	@Mock
	private TestService testService;

	@Test
	public void getStrings() throws Exception {
		when(testService.getStrings()).
			thenReturn(
				Arrays.asList(new com.example.bootapp.model.Test("a", "b", "c"),
					new com.example.bootapp.model.Test("a", "b", "c"),
					new com.example.bootapp.model.Test("a", "b", "c")
				)
			);
		assertTrue(testService.getStrings().size() == 3);

	}

}
