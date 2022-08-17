package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;

public interface IDepartamentoService {
	// Metodos del crud para departamento
	public List<Departamento> listarDepartamentos(); // Listar todos
	
	public Departamento guardarDepartamento(Departamento departamento); // Guardar
	
	public Departamento departamentoXCodigo(Long codigo); // Departament x codigo
	
	public List<Departamento> listarDepartamentoNombre(String nombre); // Departamentos x nombre
	
	public Departamento actualizarDepartamento(Departamento departamento); // actualizar departamento update
	
	public void eliminarDepartamento(Long codigo); // Eliminar departamento por codigo
}
