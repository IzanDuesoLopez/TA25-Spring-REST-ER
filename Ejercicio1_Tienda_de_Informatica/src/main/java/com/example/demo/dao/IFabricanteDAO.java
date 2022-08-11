package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long>{

	// Listamos fabricantes por el campo nombre
	public List<Fabricante> findByNombre(String nombre);
	
}
