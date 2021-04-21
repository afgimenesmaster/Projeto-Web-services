package com.projeto.negocio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.negocio.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
