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

import com.example.demo.service.ArticuloServiceImpl;
import com.example.demo.service.FabricanteServiceImpl;

import com.example.demo.dto.Articulo;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	// Listamos todos los articulos
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articuloServiceImpl.listarArticulos();
	}
	
	// Listamos articulos por nombre
	@GetMapping("/articulos/nombre/{nombre}")
	public List<Articulo> listarArticulosNombre(@PathVariable(name = "nombre") String nombre){
		return articuloServiceImpl.listarArticuloNombre(nombre);
	}
	
	// Posteamos un articulo
	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	// Listamos articulos por codigo
	@GetMapping("/articulos/{codigo}")
	public Articulo articuloXCodigo(@PathVariable(name = "codigo") Long codigo) {
		Articulo articulo_x_codigo = new Articulo();
		articulo_x_codigo = articuloServiceImpl.articuloXCodigo(codigo);
		return articulo_x_codigo;
	}
	
	// Actualizamos articulos por codigo
	@PutMapping("/articulos/{codigo}")
	public Articulo actualizarArticulo(@PathVariable(name = "codigo") Long codigo, Articulo articulo) {
		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();
		
		articulo_seleccionado = articuloServiceImpl.articuloXCodigo(codigo);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		return articulo_actualizado;
	}
	
	// Eliminar articulo por ID
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulo(@PathVariable(name = "codigo") Long codigo) {
		articuloServiceImpl.eliminarArticulo(codigo);
	}
}
