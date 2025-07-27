package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeRequest;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	@GetMapping("/wish")
	public String greet() {
		return "Wecolme to the main Page ";
	}
	
	
	@PostMapping("/create") 
	public ResponseEntity<String> createEmployee(@RequestBody EmployeeRequest request){
		if(request !=null) {
			Employee emp= new Employee();
			emp.setName(request.getName());
			emp.setCity(request.getCity());
			employeeRepo.save(emp);
		}
		
		
		return ResponseEntity.ok("Employee created successfully."+request);
	}
	

}
