package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	private TestRepository testRepository;
	
	public void add(String name) {
		Test test = new Test();
		test.setName(name);
		testRepository.save(test);
	}

	public List<Test> getAllUsers() {
		return testRepository.findAll();
	}
}
