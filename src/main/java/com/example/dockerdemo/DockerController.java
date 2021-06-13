package com.example.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("test")
	public String getTest() {
		return "Welcome To Docker!!!";
	}

}
