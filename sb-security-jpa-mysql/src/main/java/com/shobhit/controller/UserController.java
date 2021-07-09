package com.shobhit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/message/{name}")
	public String message(@PathVariable String name) {
		return "Hello " + name + ", Welcome to the User Page.";
	}
}