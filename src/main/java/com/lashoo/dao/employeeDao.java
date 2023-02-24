package com.lashoo.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.lashoo.enums.RoleEnums;
import com.lashoo.model.Address;
import com.lashoo.model.Employee;
import com.lashoo.model.Role;

public class employeeDao {
	
	public static List<Employee> find(){
		List<Employee> employee = new ArrayList<>();
		Set<Role> role = new HashSet<>();		
		role.add(new Role(1,RoleEnums.Manager));
		Set<Address> address = new HashSet<>();	
		address.add(new Address(101,"2231 Live Oak", "Commerce", "Texas", "Hunt", "U.S", "75038"));
		employee.add(new Employee(1,"Usha","Rana","1112223333","usharana@gmail.com","usra99","YoYo", role,address));
		return employee;	
	}

}
