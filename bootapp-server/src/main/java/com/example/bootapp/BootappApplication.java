package com.example.bootapp;

import com.example.bootapp.service.ApiProxyService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootappApplication.class, args);
	}
@Bean
	CommandLineRunner start(ApiProxyService service){
		return args -> {
		};
	}
}
