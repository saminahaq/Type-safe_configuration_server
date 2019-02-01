package com.samina.ResetService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {
//http://localhost:8080/surveys/Survey1/questions/
/*
 * ## What You Will Learn during this Step:
- Even better configuration management than @Value
- Type-safe Configuration Properties
- http://localhost:8080/dynamic-configuration
- Also look at http://localhost:8080/actuator/#http://localhost:8080/configprops
http://localhost:8080/dynamic-configuration
 * */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

	}
	/*@Profile("prod")
	@Bean
	public String dummy() {
		return "something";
	}*/

}
