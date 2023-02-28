package com.lashoo.service;

import java.util.List;

import com.lashoo.model.Employee;

public interface EmployeeService {
	
	public void save(Employee employee);

	public List<Employee> findAll();

}

