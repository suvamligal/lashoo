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
public class Address {
	private int aID;
	private String street;
	private String city;
	private String State;
	private String County;
	private String Country;
	private String zipCode;

}
