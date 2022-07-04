package com.devtec.br.Spring_MVC.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devtec.br.Spring_MVC.entity.User;

@Repository

public interface UserRepository extends JpaRepository<User, Long>{

	

}