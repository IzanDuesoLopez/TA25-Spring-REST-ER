package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

	public List<Pelicula> findByNombre(String nombre);
	
}
