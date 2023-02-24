package com.lashoo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lashoo.model.Employee;
import com.lashoo.repository.EmployeeRepository;
import com.lashoo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);		
	}
	
	
	
	

}
