package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ISalaDAO;
import com.example.demo.dto.Sala;

public class SalaServiceImpl implements ISalaService{

	@Autowired
	ISalaDAO iSalaDAO;
	
	@Override
	public List<Sala> listarSalas() {
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSalas(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXCodigo(int codigo) {
		return iSalaDAO.findById(codigo).get();
	}

	@Override
	public List<Sala> listarSalaNombre(String nombre) {
		return iSalaDAO.findByNombre(nombre);
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(int codigo) {
		iSalaDAO.deleteById(codigo);
		
	}

}
