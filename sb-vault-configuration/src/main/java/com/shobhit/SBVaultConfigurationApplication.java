package com.shobhit;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SBVaultConfigurationApplication {

	@Autowired
	private ApplicationConfig config;

	@Value("${app.banner}")
	private String banner;

	@Value("${app.username}")
	private String username;

	@Value("${app.password}")
	private String password;

	@PostConstruct
	public void displayCredentials() {
		System.out.println("Banner - " + banner);
		System.out.println("App Username bootstrap.properties - " + username);
		System.out.println("App Password bootstrap.properties - " + password);

		System.out.println("Username ApplicationConfig - " + config.getUsername());
		System.out.println("Password ApplicationConfig - " + config.getPassword());
	}

	public static void main(String[] args) {
		SpringApplication.run(SBVaultConfigurationApplication.class, args);
	}
}