package com.ecoleit.fap.visit.dto;

import com.ecoleit.fap.visit.entity.Visit;
import com.ecoleit.fap.visit.entity.Visitor;

public class VisitDTO {
	private boolean interest;
	private StandDTO standDTO;
	private VisitorDTO visitor;

	public VisitDTO(boolean interest) {
		super();
		this.interest = interest;
	}

	public VisitDTO() {
		super();
	}
	
	

	public boolean isInterest() {
		return interest;
	}
	
	

	public StandDTO getStandDTO() {
		return standDTO;
	}

	public void setStandDTO(StandDTO standDTO) {
		this.standDTO = standDTO;
	}

	public VisitorDTO getVisitor() {
		return visitor;
	}

	public void setVisitor(VisitorDTO visitor) {
		this.visitor = visitor;
	}

	public void setInterest(boolean interest) {
		this.interest = interest;
	}
	
	public void mapVisitEntity(Visit entity) {
		
		this.setInterest(entity.isInterest());
		VisitorDTO visitor=new VisitorDTO();
		visitor.mapVisitorEntity(entity.getVisitor());
		this.setVisitor(visitor);
		StandDTO stand=new StandDTO();
		stand.mapStandEntity(entity.getStand());
		this.setStandDTO(stand);
		
		
		
	}

}
