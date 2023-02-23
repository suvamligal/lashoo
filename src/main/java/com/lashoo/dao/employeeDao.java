package com.lashoo.dao;

import java.util.ArrayList;
import java.util.List;

import com.lashoo.model.Employees;

public class employeeDao {
	
	public static List<Employees> find(){
		List<Employees> employee = new ArrayList<>();
		employee.add(new Employees(1,"Usha","Rana","1112223333","usharana@gmail.com","usra99","YoYo"));
		return employee;	
	}

}
