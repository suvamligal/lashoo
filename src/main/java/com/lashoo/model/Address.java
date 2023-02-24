package com.lashoo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="address")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "adress_id")
	private int adress_id;
	
	private String street;
	private String city;
	private String state;
	private String county;
	private String country;
	private String zipCode;
	

}
