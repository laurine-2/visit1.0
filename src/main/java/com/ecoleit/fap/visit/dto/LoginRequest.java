package com.ecoleit.fap.visit.dto;

public class LoginRequest {
	private String email;

	public LoginRequest(String email) {
		super();
		this.email = email;
	}

	public LoginRequest() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
