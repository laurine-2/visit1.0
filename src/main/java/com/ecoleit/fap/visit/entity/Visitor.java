package com.ecoleit.fap.visit.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@DiscriminatorColumn(name="visitor")
@Table(name="visitors")
public class Visitor{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idVisitor", nullable = false)
	private int idVisitor;
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
	
	@Enumerated(EnumType.STRING)
	private TypeVisitor typeVisitor;
	
	@OneToMany(mappedBy="visitor")
	private List<Visit> visits;
	//private List<Visit> visit=new ArrayList<Visit>();
	@OneToOne
    @JoinColumn(name = "user_id")
    private User user;

	public Visitor() {
		super();
	}

	

	public Visitor(String name, String surname, String adresse, String phone,
			String poBox, String town, TypeVisitor typeVisitor, User user) {
		super();
		this.name = name;
		this.surname = surname;
		this.adresse = adresse;
		this.phone = phone;
		this.poBox = poBox;
		this.town = town;
		this.typeVisitor = typeVisitor;
		this.user = user;
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

	public TypeVisitor getTypeVisitor() {
		return typeVisitor;
	}

	public void setTypeVisitor(TypeVisitor typeVisitor) {
		this.typeVisitor = typeVisitor;
	}

	/*public List<Visit> getVisit() {
		return visit;
	}

	public void setVisit(List<Visit> visit) {
		this.visit = visit;
	}
*/


	public String getTown() {
		return town;
	}



	public void setTown(String town) {
		this.town = town;
	}
	
	

}
