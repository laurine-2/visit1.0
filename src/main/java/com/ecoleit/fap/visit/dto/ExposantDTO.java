package com.ecoleit.fap.visit.dto;

import com.ecoleit.fap.visit.entity.Exposant;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;

public class ExposantDTO {
	
	private int idExposant;
	
	private String name;
	
	private String surname;
	
	private String adresse;
	
	private String phone;
	
	private String email;
	
	private String poBox;
	
	private String town;
	private String paswword;
	
	
	

	public ExposantDTO() {
		super();
	}
	
	
 

	public ExposantDTO(String name, String surname, String adresse, String phone, String email, String poBox,
			String town, String paswword) {
		super();
		this.name = name;
		this.surname = surname;
		this.adresse = adresse;
		this.phone = phone;
		this.email = email;
		this.poBox = poBox;
		this.town = town;
		this.paswword = paswword;
	}




	public ExposantDTO(int idExposant, String name, String surname, String adresse, String phone, String email,
			String poBox, String town, String paswword) {
		super();
		this.idExposant = idExposant;
		this.name = name;
		this.surname = surname;
		this.adresse = adresse;
		this.phone = phone;
		this.email = email;
		this.poBox = poBox;
		this.town = town;
		this.paswword = paswword;
	}




	public int getIdExposant() {
		return idExposant;
	}

	public void setIdExposant(int idExposant) {
		this.idExposant = idExposant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}
		
      public String getPaswword() {
		return paswword;
	}


	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}




	public void mapExposantEntity(Exposant entity) {
		
		 
		this.setAdresse(entity.getAdresse());
		this.setName(entity.getName());
		this.setPoBox(entity.getPoBox());
		this.setPhone(entity.getPhone());
		this.setSurname(entity.getSurname());
		this.setTown(entity.getTown());
		this.setIdExposant(entity.getId());
		this.setEmail(entity.getEmail());
		this.setPaswword(entity.getPassword());
		
		
		
	}
	
	

	 
}
