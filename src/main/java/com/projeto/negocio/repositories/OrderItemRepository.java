package com.projeto.negocio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.negocio.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
