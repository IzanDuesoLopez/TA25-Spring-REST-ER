package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Long>{

	// Listamos departamentos por nombre
	public List<Departamento> findByNombre(String nombre);
	
}
