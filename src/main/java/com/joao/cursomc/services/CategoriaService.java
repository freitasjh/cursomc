package com.joao.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joao.cursomc.domain.Categoria;
import com.joao.cursomc.repositories.CategoriaRepositiory;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepositiory repository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
