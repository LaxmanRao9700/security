package com.example.spring_boot_resource_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	 @GetMapping("/hello")
	    public String hello() {
	        return "Hello from Resource Server!";
	    }
}
