package com.ecoleit.fap.visit.service;

import org.springframework.stereotype.Service;

import com.ecoleit.fap.visit.dto.VisitDTO;
import com.ecoleit.fap.visit.entity.Stand;
import com.ecoleit.fap.visit.entity.Visit;
import com.ecoleit.fap.visit.entity.Visitor;
import com.ecoleit.fap.visit.repository.VisitRepository;
import com.ecoleit.fap.visit.repository.VisitorRepository;
import java.util.*;

@Service
public class VisitService {
	private VisitRepository repository;

	public VisitService(VisitRepository repository) {
		super();
		this.repository = repository;
	}
 
	public void addVisit(Visit visit) {
		repository.save(visit);
	}
	
	public java.util.List<Visit> getVisits(){
		return repository.findAll();
	}
	
	public List <VisitDTO> getVisitors(Stand stand){
		
		List <VisitDTO> visitors=new ArrayList<>();
		
		List <Visit> list= repository.findByStand(stand);
		for(Visit visit:list) {
			VisitDTO dto=new VisitDTO();
			dto.mapVisitEntity(visit);
			visitors.add(dto);
		}
		
		return visitors;
	}
	
	public List<VisitDTO> getStands(Visitor visitor){
		List <VisitDTO> stands=new ArrayList<>();
		List <Visit> list= repository.findByVisitor(visitor);
		for(Visit visit:list) {
			VisitDTO dto=new VisitDTO();
			dto.mapVisitEntity(visit);
			stands.add(dto);
		}
		
		return stands;
	}
	
	
	
	
}
