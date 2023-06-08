package com.ecoleit.fap.visit.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoleit.fap.visit.dto.StandDTO;
import com.ecoleit.fap.visit.dto.VisitDTO;
import com.ecoleit.fap.visit.dto.VisitorDTO;
import com.ecoleit.fap.visit.entity.Stand;
import com.ecoleit.fap.visit.entity.Visit;
import com.ecoleit.fap.visit.entity.Visitor;
import com.ecoleit.fap.visit.service.StandService;
import com.ecoleit.fap.visit.service.VisitService;
import com.ecoleit.fap.visit.service.VisitorService;

@RestController
@RequestMapping("/visitors")
@Secured({"ADMIN", "SA","VISITOR"})

public class VisitorController {
	private VisitorService service;
	private VisitService visitService;
	private StandService standService;
	
	public VisitorController(VisitorService service, VisitService visitService, StandService standService) {
		super();
		this.service = service;
		this.visitService = visitService;
		this.standService = standService;
	}
	@PostMapping
	public void addVisitor(@RequestBody Visitor visitor) {
		 service.addVisitor(visitor);
	}
	@GetMapping
	public List<Visitor> getVisitors(){
		
		return service.getAllVisitor();
		
	}
	
	@PostMapping("{id}/stands/{idS}")
	public void addVisit(@PathVariable("id") int id,@PathVariable("idS") int idS, @RequestBody VisitDTO visitDTO) {
		
		StandDTO standDTO=standService.getStand(idS);
		Visitor visitor=service.getVisitor(id);
		Stand stand=new Stand();
		stand.mapStandDTO(standDTO);
		Visit visit=new Visit();
		visit.setInterest(visitDTO.isInterest());
		visit.setStand(stand);
		visit.setVisitor(visitor);
		visitService.addVisit(visit);
		
		
	}
	@GetMapping("{id}")
	public ResponseEntity<Visitor> getVisitor (@PathVariable("id") int id) {
		Visitor visitor = service.getVisitor(id);
		if(visitor != null) {
			return ResponseEntity.status(HttpStatus.OK).body(visitor);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
	}
	
	@GetMapping("{id}/stands")
	@Secured({"ADMIN", "SA","VISITOR"})
	public List<VisitDTO> getStands(@PathVariable("id") int id){
		
		Visitor visitor=service.getVisitor(id);
		
		return visitService.getStands(visitor);
		
	}

}
