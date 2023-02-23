package com.lashoo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employees {

	private int employeeId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String username;
	private String password;

}
