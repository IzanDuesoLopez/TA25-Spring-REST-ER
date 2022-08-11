package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {

	// Metodos del crud para Fabricante
	public List<Fabricante> listarFabricantes(); // Mostrar todos los fabricantes
	
	public Fabricante guardarFabricante(Fabricante fabricante); // Guardamos un fabricante CREATE
	
	public Fabricante fabricanteXCodigo(Long codigo); // Datos fabricantes a partir de Codigo
	
	public List<Fabricante> listarFabricanteNombre(String nombre); // Listamos fabricante por nombre
	
	public Fabricante actualizarFabricante(Fabricante fabricante); // Actualizamos fabricante UPDATE
	
	public void eliminarFabricante(Long codigo); // Eliminamos fabricante por codigo
}
