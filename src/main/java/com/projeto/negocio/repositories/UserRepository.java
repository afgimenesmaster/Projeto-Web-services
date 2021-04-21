package com.projeto.negocio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.negocio.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
