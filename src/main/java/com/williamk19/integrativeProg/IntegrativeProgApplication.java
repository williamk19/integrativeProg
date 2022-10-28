package com.williamk19.integrativeProg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class IntegrativeProgApplication {
	UserService userService = new UserService();

	public static void main(String[] args) {
		SpringApplication.run(IntegrativeProgApplication.class, args);
	}

	@GetMapping("/users")
	@CrossOrigin(origins="*")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(userService.getAll(), HttpStatus.NOT_FOUND);
	}
}
