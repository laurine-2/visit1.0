package com.ecoleit.fap.visit.dto;

import java.util.List;

import com.ecoleit.fap.visit.entity.Stand;
import com.ecoleit.fap.visit.entity.TypeVisitor;
import com.ecoleit.fap.visit.entity.Visit;
import com.ecoleit.fap.visit.entity.Visitor;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;

public class VisitorDTO {
	
	private int idVisitor;
	private String name;
	
	private String surname;
	
	private String adresse;
	
	private String phone;
	 
	private String poBox;
	
	private String town;
	private String email;
	private String paswword;
	
	
	private TypeVisitor typeVisitor;
	
	
	private List<Visit> visits;


	public VisitorDTO(int idVisitor, String name, String surname, String adresse, String phone, String poBox,
			String town, TypeVisitor typeVisitor, List<Visit> visits) {
		super();
		this.idVisitor = idVisitor;
		this.name = name;
		this.surname = surname;
		this.adresse = adresse;
		this.phone = phone;
		this.poBox = poBox;
		this.town = town;
		this.typeVisitor = typeVisitor;
		this.visits = visits;
	}
	
	


	public VisitorDTO(int idVisitor, String name, String surname, String adresse, String phone, String poBox,
			String town, String email, String paswword, TypeVisitor typeVisitor) {
		super();
		this.idVisitor = idVisitor;
		this.name = name;
		this.surname = surname;
		this.adresse = adresse;
		this.phone = phone;
		this.poBox = poBox;
		this.town = town;
		this.email = email;
		this.paswword = paswword;
		this.typeVisitor = typeVisitor;
		
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPaswword() {
		return paswword;
	}




	public void setPaswword(String paswword) {
		this.paswword = paswword;
	}




	public VisitorDTO() {
		super();
	}


	public VisitorDTO(String name, String surname, String adresse, String phone, String poBox, String town,
			TypeVisitor typeVisitor) {
		super();
		this.name = name;
		this.surname = surname;
		this.adresse = adresse;
		this.phone = phone;
		this.poBox = poBox;
		this.town = town;
		this.typeVisitor = typeVisitor;
	}


	public int getIdVisitor() {
		return idVisitor;
	}


	public void setIdVisitor(int idVisitor) {
		this.idVisitor = idVisitor;
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


	public TypeVisitor getTypeVisitor() {
		return typeVisitor;
	}


	public void setTypeVisitor(TypeVisitor typeVisitor) {
		this.typeVisitor = typeVisitor;
	}


	public List<Visit> getVisits() {
		return visits;
	}


	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}
	
	public void mapVisitorEntity(Visitor entity) {
		
		this.setAdresse(entity.getAdresse());
		this.setName(entity.getName());
		this.setPoBox(entity.getPoBox());
		this.setPhone(entity.getPhone());
		this.setSurname(entity.getSurname());
		this.setTown(entity.getTown());
		this.setIdVisitor(entity.getId());
		this.setEmail(entity.getEmail());
		this.setPaswword(entity.getPassword());
		
	}
	
	

}
