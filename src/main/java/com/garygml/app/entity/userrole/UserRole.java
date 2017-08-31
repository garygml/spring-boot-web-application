package com.garygml.app.entity.userrole;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.garygml.app.entity.GenericEntity;
import com.garygml.app.entity.role.Role;
import com.garygml.app.entity.user.User;

@Entity
@Table(name="USER_ROLE")
public class UserRole extends GenericEntity {
	
	User user;
	Role role;
	
	@Override
	@Id
	@Column(name="ID_USER_ROLE")
	@GeneratedValue
	public Long getId(){
		return super.getId();
	}
	
	@Override
	@Column(name="STATUS")
	public String getStatus(){
		return super.getStatus();
	}

	@ManyToOne
	@JoinColumn(name="ID_USER")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name="ID_ROLE")
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
