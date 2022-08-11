package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Articulo;

public interface IArticuloService {

	// Metodos del CRUD para Articulo
	public List<Articulo> listarArticulos(); // Mostramos todos los articulos
	
	public Articulo guardarArticulo(Articulo articulo); // Guardamos un articulo CREATE
	
	public Articulo articuloXCodigo(Long codigo); // Datos de articulo a partir de codigo
	
	public List<Articulo> listarArticuloNombre(String nombre); // Datos articulo por nombre
	
	public Articulo actualizarArticulo(Articulo articulo); // Actualizamos articulo
	
	public void eliminarArticulo(Long codigo); // Eliminamos articulo por codigo DELETE
	
}
