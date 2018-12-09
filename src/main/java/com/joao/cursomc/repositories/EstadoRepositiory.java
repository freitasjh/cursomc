package com.joao.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joao.cursomc.domain.Estado;

@Repository
public interface EstadoRepositiory extends JpaRepository<Estado, Integer>{

	
	
}
