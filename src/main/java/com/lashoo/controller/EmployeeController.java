package com.lashoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lashoo.model.Employee;
import com.lashoo.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return ResponseEntity.ok("Data Saved");
	}


}
