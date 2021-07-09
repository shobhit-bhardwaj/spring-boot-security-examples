package com.shobhit.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String publicUser() {
		return "Hello to Public Users";
	}

	@GetMapping("/user")
	public String user(Principal principal) {
		return "Hello to Register User - " + principal.getName();
	}

	@GetMapping("/admin")
	public String admin(Principal principal) {
		return "Hello to Admin User - " + principal.getName();
	}
}