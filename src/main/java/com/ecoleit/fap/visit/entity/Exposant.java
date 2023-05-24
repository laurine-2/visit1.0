package com.ecoleit.fap.visit.entity;

import com.ecoleit.fap.visit.dto.ExposantDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="exposants")
public class Exposant extends User{
	/*@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_exposant")
	private int id_exposant;*/
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private String adresse;
	@Column
	private String phone;
	@Column 
	private String poBox;
	@Column
	private String town;
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_stand")
    private Stand stand;*/
	
	public Exposant() {
		super();
		
	}

	 
	public Exposant(String name, String surname, String adresse, String phone,
			String poBox, String town) {
		super();
		this.name = name;
		this.surname = surname;
		this.adresse = adresse;
		this.phone = phone;
		this.poBox = poBox;
		this.town = town;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
	
	public void mapExposantDTO(ExposantDTO dto) {
		
		//Exposant entity=new Exposant();
		this.setAdresse(dto.getAdresse());
		this.setId(dto.getIdExposant());
		this.setName(dto.getName());
		this.setTown(dto.getTown());
		this.setSurname(dto.getSurname());
		this.setPoBox(dto.getPoBox());
		this.setPhone(dto.getPhone());
		this.setEmail(dto.getEmail());
		this.setPassword(dto.getPaswword());
		
		
		
	}
	
	

}
