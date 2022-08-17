package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSalas();
	public Sala guardarSalas(Sala sala);
	public Sala salaXCodigo(int codigo);
	public List<Sala> listarSalaNombre(String nombre);
	public Sala actualizarSala(Sala sala);
	public void eliminarSala(int codigo);
	
}
