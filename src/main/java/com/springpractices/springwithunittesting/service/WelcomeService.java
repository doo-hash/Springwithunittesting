package com.springpractices.springwithunittesting.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

	public String welcomeMsg() {
		return "welcome";
	}
}
