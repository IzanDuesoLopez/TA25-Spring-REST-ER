package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Integer>{

	public List<Sala> findByNombre(String nombre);
	
}
