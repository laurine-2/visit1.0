package com.ecoleit.fap.visit.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoleit.fap.visit.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByEmail(String email);

}
