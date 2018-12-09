package com.joao.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joao.cursomc.domain.Cidade;

@Repository
public interface CidadeRepositiory extends JpaRepository<Cidade, Integer>{

	
	
}
