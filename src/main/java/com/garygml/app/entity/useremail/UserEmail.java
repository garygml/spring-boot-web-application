package com.garygml.app.entity.useremail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.garygml.app.entity.GenericEntity;
import com.garygml.app.entity.user.User;

@Entity
@Table(name="USER_EMAIL")
public class UserEmail extends GenericEntity {
	
	User user;
	String email;
	
	@Override
	@Column(name="ID_USER_EMAIL")
	@Id
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

	@Column(name="EMAIL_ADDR")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}