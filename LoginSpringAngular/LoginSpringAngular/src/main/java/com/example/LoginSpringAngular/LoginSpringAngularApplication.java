package com.example.LoginSpringAngular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class LoginSpringAngularApplication {

	@GetMapping("/")
	public String login(){
		return "Authenticated Successfully";
	}

	@GetMapping("/getUsers")
	public List<User> getUser(){
		return Stream.of(new User(101,"shaha","shaha@gmail.com","7854227"),
						new User(102,"meenu","meenu@gmil.com","3279269"))
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginSpringAngularApplication.class, args);
	}

}
