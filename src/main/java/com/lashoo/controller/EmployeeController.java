package com.lashoo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lashoo.dao.employeeDao;
import com.lashoo.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@GetMapping("/findAll")
	public List<Employee> findAll(){
		return employeeDao.find();
	}

}
