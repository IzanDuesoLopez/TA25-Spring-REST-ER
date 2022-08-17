package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDAO;
import com.example.demo.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	// Utilizamos los metodos de IDepartamentoDAO
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;

	@Override
	public List<Departamento> listarDepartamentos() {
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXCodigo(Long codigo) {
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public List<Departamento> listarDepartamentoNombre(String nombre) {
		return iDepartamentoDAO.findByNombre(nombre);
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long codigo) {
		iDepartamentoDAO.deleteById(codigo);
	}
}
