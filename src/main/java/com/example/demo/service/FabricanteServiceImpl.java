package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{

	// Utilizamos los metodos de IFabricanteDAO
	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXCodigo(Long codigo) {
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public List<Fabricante> listarFabricanteNombre(String nombre) {
		return iFabricanteDAO.findByNombre(nombre);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long codigo) {
		iFabricanteDAO.deleteById(codigo);
	}
	
}
