package com.ecoleit.fap.visit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="user_type")
@Table(name="users")
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String email;
	@Column
	private String password;
	
	public User() {
		super();
	}
	public User(String login, String password) {
		super();
		this.email = login;
		this.password = password;
	}
	public User(int idUser, String login, String password) {
		super();
		this.id = idUser;
		this.email = login;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int idUser) {
		this.id = idUser;
	}
 
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

}
