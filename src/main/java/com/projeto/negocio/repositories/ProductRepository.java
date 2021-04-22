package com.projeto.negocio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.negocio.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
