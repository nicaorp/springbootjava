package com.nfsoftwares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfsoftwares.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
