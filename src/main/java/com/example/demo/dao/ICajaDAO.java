package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Caja;

public interface ICajaDAO extends JpaRepository<Caja, String>{

	
}
