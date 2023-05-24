package com.ecoleit.fap.visit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecoleit.fap.visit.entity.*;

public interface StandRepository extends JpaRepository<Stand, Integer>{
	
	//public List<Visitor> findVisitorById(int id);

}
