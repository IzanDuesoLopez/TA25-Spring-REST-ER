package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDAO;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	IPeliculaDAO iPeliculaDAO;
	
	@Override
	public List<Pelicula> listarPeliculas() {
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula peliculaXCodigo(int codigo) {
		return iPeliculaDAO.findById(codigo).get();
	}

	@Override
	public List<Pelicula> listarPeliculaNombre(String nombre) {
		return iPeliculaDAO.findByNombre(nombre);
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int codigo) {
		iPeliculaDAO.deleteById(codigo);
		
	}

}
