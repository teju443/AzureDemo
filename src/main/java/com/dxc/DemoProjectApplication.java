package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoProjectApplication {
	
	@GetMapping("/message")
	public String message() {
	return "congrats ! your app deployed successfully in Azure !";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}

}
