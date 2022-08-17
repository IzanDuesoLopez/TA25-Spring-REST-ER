package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{
	
	// Listamos articulos por nombre
	public List<Articulo> findByNombre(String nombre);
	
}
