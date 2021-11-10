package com.nfsoftwares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfsoftwares.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
