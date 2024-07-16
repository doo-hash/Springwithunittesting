package com.springpractices.springwithunittesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springpractices.springwithunittesting.service.WelcomeService;

@RestController
public class HelloController {

	@Autowired
	private WelcomeService service;
	
	@GetMapping("/hello")
	public ResponseEntity<String> welcomeMessage() {
		return new ResponseEntity<>(service.welcomeMsg(),HttpStatus.OK);
	}
}
