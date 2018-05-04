package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/user")
	public List<Test> getAllUsers() {
		return testService.getAllUsers();
	}
	
	@RequestMapping("/adduser/{name}")
	public String addUser(@PathVariable String name) {
		testService.add(name);
		return name;
	}
}
