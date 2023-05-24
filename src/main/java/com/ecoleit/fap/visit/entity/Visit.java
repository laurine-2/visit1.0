package com.ecoleit.fap.visit.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="visit")
public class Visit  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id_visit")
	private int idVisit;
	@Column
	private boolean interest;
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(name="visitors_id")
	@JsonIgnore
	private Visitor visitor;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idStand")
	@JsonIgnore
	private Stand stand;

	public Visit() {
		super();
	}

	public Visit(int idVisit, boolean interest, Visitor visitor, Stand stand) {
		super();
		this.idVisit = idVisit;
		this.interest = interest;
		this.visitor = visitor;
		this.stand = stand;
	}

	public Visit(boolean interest, Visitor visitor, Stand stand) {
		super();
		this.interest = interest;
		this.visitor = visitor;
		this.stand = stand;
	}

	public int getIdVisit() {
		return idVisit;
	}

	public void setIdVisit(int idVisit) {
		this.idVisit = idVisit;
	}

	public boolean isInterest() {
		return interest;
	}

	public void setInterest(boolean interest) {
		this.interest = interest;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public Stand getStand() {
		return stand;
	}

	public void setStand(Stand stand) {
		this.stand = stand;
	}
	
	

}
