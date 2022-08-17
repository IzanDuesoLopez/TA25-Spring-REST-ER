package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenService {

	// Metodos para el full crud
	public List<Almacen> listarAlmacenes();
	public Almacen guardarAlmacen(Almacen almacen);
	public Almacen almacenXCodigo(int codigo);
	public List<Almacen> listarAlmacenNombre(String nombre);
	public Almacen actualizarAlmacen(Almacen almacen);
	public void eliminarAlmacen(int codigo);
	
}
