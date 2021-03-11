package com.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class RestExceptionHandlingDemoOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExceptionHandlingDemoOneApplication.class, args);
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource bean = new ResourceBundleMessageSource();
		bean.setBasename("errormessages/messages");
		bean.setDefaultEncoding("UTF-8");
		return bean;
	}
}
