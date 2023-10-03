package com.dockertest.sampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleappApplication {
	
	@GetMapping("/test")
	public String getMessage() {
		
		return "testing docker app1";
	}
	
	@GetMapping("/testdocker")
	public String getDockerMessage() {
		
		return "testing docker app2";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleappApplication.class, args);
	}

}
