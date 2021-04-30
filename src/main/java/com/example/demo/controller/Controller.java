package com.example.demo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restful-service")
public class Controller {

	@GetMapping("/current")
	public ResponseEntity<String> restfulTest() {
		System.out.println("===== restful service =====");
		return new ResponseEntity<>(new Date().toString(), HttpStatus.OK);
	}
}
