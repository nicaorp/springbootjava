package com.nfsoftwares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfsoftwares.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
