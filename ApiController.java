package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
 
	@Value("${student.Name}")
	public String Name;
	
	@GetMapping("/")
    public String getName()
    {
    	return Name;
    }
	
	
}

