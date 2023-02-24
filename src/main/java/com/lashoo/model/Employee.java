package com.lashoo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Entity
@Table(name ="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employee_id;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String username;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="role_id")
	private Role role;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;

}
