package com.garygml.app.entity.role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.garygml.app.entity.GenericEntity;

@Entity
@Table(name="ROLE")
public class Role extends GenericEntity {
	
	String roleDescription;
	String roleCode;
	
	@Override
	@Id
	@Column(name="ID_ROLE")
	@GeneratedValue
	public Long getId(){
		return super.getId();
	}
	
	@Override
	@Column(name="STATUS")
	public String getStatus(){
		return super.getStatus();
	}
	
	@Column(name="ROLE_DESCRIPTION")
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	@Column(name="ROLE_CODE")
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	
	

}
