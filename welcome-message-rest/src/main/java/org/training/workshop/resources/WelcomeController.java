package org.training.workshop.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.training.workshop.model.Message;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String greeting() {
		return "Welcome , Spring Boot 2!";
	}
	
	
	@GetMapping("/welcome-message")
	public Message greetingMessage() {
		return new Message();
	}
	
	@GetMapping("/welcome/{message}")
	public String greetingMessageWithPathVariable(@PathVariable String message) {
		return "Welcome , " + message; 
	}
	

}
