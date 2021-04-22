package com.projeto.negocio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.negocio.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
