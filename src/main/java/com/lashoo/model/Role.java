package com.lashoo.model;

import com.lashoo.enums.RoleEnums;

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
public class Role {
	private int roleID;
	private RoleEnums roleName;
}
