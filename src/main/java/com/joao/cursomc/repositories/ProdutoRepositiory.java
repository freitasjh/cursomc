package com.joao.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joao.cursomc.domain.Produto;

@Repository
public interface ProdutoRepositiory extends JpaRepository<Produto, Integer>{

	
	
}
