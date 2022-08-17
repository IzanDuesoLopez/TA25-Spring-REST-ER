package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer>{

	public List<Almacen> findByNombre(String nombre);
	
}