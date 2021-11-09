package com.nfsoftwares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfsoftwares.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
