package com.moduleone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ModuleOneApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(ModuleOneApplication.class, args);
	}
	
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String hello() {
		return "Hello There, Welcome to MicroService ";
	}
}
