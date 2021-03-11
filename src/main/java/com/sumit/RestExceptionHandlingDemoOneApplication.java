package com.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class RestExceptionHandlingDemoOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExceptionHandlingDemoOneApplication.class, args);
	}
	//Internationalization: step1
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource bean = new ReloadableResourceBundleMessageSource();
		bean.setBasename("errormessages/messages");
		bean.setDefaultEncoding("UTF-8");
		return bean;
	}
}