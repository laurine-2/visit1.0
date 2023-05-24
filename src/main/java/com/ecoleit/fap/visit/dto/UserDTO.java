package com.ecoleit.fap.visit.dto;



public class UserDTO {
	private int idUser;
	private String login;
	private String password;
	private String user_type;
	
	
	public UserDTO() {
		super();
	}


	public UserDTO(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}


	public UserDTO(int idUser, String login, String password) {
		super();
		this.idUser = idUser;
		this.login = login;
		this.password = password;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
