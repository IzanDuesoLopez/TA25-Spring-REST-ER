package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{

	// Utilizamos metodos de la interfaz IArticuloService, a continuacion lo instanciamos
	@Autowired
	IArticuloDAO iArticuloDAO;
	
	
	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXCodigo(Long codigo) {
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public List<Articulo> listarArticuloNombre(String nombre) {
		return iArticuloDAO.findByNombre(nombre);
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long codigo) {
		iArticuloDAO.deleteById(codigo);
	}

}
