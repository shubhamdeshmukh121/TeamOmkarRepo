package com.wcs.app.jf.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	@Id
	private int roleId;
	private String roleName;
	private int roleStatusCode;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRoleStatusCode() {
		return roleStatusCode;
	}
	public void setRoleStatusCode(int roleStatusCode) {
		this.roleStatusCode = roleStatusCode;
	}
	
	
}
