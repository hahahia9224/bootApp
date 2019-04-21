package com.example.bootApp.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Slf4j
@Configuration
public class GeneralConfiguration {

	@Value("${spring.profiles.active:local}")
	private String profile;

	@Bean
	public PropertiesFactoryBean propertiesFactoryBean() {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		propertiesFactoryBean.setLocation(new ClassPathResource(String.format("application-%s.yml", profile)));

		return propertiesFactoryBean;
	}

}
