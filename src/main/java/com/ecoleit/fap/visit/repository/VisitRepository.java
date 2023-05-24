package com.ecoleit.fap.visit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecoleit.fap.visit.entity.Stand;
import com.ecoleit.fap.visit.entity.Visit;
import com.ecoleit.fap.visit.entity.Visitor;

public interface VisitRepository extends JpaRepository<Visit, Integer>{
	public List<Visit> findByVisitor(Visitor visitor);
	public List<Visit> findByStand(Stand stand);
	

}
