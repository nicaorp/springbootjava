package com.nfsoftwares.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nfsoftwares.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
