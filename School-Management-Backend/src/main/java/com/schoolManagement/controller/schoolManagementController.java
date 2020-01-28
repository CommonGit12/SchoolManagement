package com.schoolManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class schoolManagementController {
	
	@GetMapping("/get/{id}")
	public String m1(@PathVariable String id) {
		// TODO Auto-generated method stub
		return "Neel "+id;
	}
}
