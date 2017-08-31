package com.garygml.app.entity.user;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.garygml.app.entity.GenericEntity;
import com.garygml.app.entity.useremail.UserEmail;
import com.garygml.app.entity.userrole.UserRole;

@Entity
@Table(name = "USER")
public class User extends GenericEntity {

	String username;
	String firstName;
	String lastName;
	String password;
	List<UserRole> userRole;
	List<UserEmail> userEmails;

	@Override
	@Id
	@Column(name = "ID_USER")
	@GeneratedValue
	public Long getId() {
		return super.getId();
	}

	@Override
	@Column(name = "STATUS")
	public String getStatus() {
		return super.getStatus();
	}

	@Column(name = "USERNAME")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
	public List<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public List<UserEmail> getUserEmails() {
		return userEmails;
	}

	public void setUserEmails(List<UserEmail> userEmails) {
		this.userEmails = userEmails;
	}

}
