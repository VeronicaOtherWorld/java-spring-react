package com.lulu.learningspringframework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello, Spring Boot!";
	}
}
