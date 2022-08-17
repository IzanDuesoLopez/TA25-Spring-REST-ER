package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pelicula;
import com.example.demo.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	// Todos los metodos del FULL CRUD
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@GetMapping("/peliculas/nombre/{nombre}")
	public List<Pelicula> listarPeliculaNombre(@PathVariable(name = "nombre") String nombre){
		return peliculaServiceImpl.listarPeliculaNombre(nombre);
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{codigo}")
	public Pelicula peliculaXCodigo(@PathVariable(name="codigo") int codigo) {
		Pelicula pelicula = new Pelicula();
		pelicula = peliculaServiceImpl.peliculaXCodigo(codigo);
		return pelicula;
	}
	
	@PutMapping("/peliculas/{codigo}")
	public Pelicula actualizarPelicula(@PathVariable(name = "codigo") int codigo,@RequestBody Pelicula pelicula) {
		Pelicula pelicula_seleccionado = new Pelicula();
		Pelicula pelicula_actualizado = new Pelicula();

		pelicula_seleccionado = peliculaServiceImpl.peliculaXCodigo(codigo);

		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setEdad(pelicula.getEdad());

		pelicula_actualizado = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionado);

		return pelicula_actualizado;
	}

	// Eliminar departamento por codigo
	@DeleteMapping("/peliculas/{codigo}")
	public void eliminarPelicula(@PathVariable(name = "codigo") int codigo) {
		peliculaServiceImpl.eliminarPelicula(codigo);
	}
	
}
