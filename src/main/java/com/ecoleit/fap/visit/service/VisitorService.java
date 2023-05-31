package com.ecoleit.fap.visit.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.ecoleit.fap.visit.entity.Visitor;
import com.ecoleit.fap.visit.repository.VisitorRepository;

@Service
public class VisitorService {
	private VisitorRepository repos;

	public VisitorService(VisitorRepository repos) {
		 
		this.repos = repos;
	}
	
	public void addVisitor(Visitor visitor) {
		 repos.save(visitor);
	}
	
	public Visitor getVisitor(int id) {
		try {
			return repos.findById(id).get();
			
		} catch (NoSuchElementException e) {
			return null;
			// TODO: handle exception
		}
		
	}
	
	public List<Visitor> getAllVisitor(){
		
		return repos.findAll();
		
	}

}
