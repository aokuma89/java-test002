package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringController {

	@GetMapping("/")
	public String hello() {
		return "hello-spring";
	}
	
}
