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

import com.example.demo.service.FabricanteServiceImpl;

import com.example.demo.dto.Fabricante;

@RestController
@RequestMapping("/api")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	// Listamos todos los fabricantes
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	// Listamos fabricantes por nombre
	@GetMapping("/fabricantes/nombre/{nombre}")
	public List<Fabricante> listarFabricanteNombre(@PathVariable(name = "nombre") String nombre){
		return fabricanteServiceImpl.listarFabricanteNombre(nombre);
	}
	
	// Posteamos un fabricante
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	// Listamos fabricantes por codigo
	@GetMapping("/fabricantes/{codigo}")
	public Fabricante fabricanteXCodigo(@PathVariable(name = "codigo") Long codigo) {
		Fabricante fabricante_x_codigo = new Fabricante();
		fabricante_x_codigo = fabricanteServiceImpl.fabricanteXCodigo(codigo);
		return fabricante_x_codigo;
	}
	
	// Actualizamos fabricantes por codigo
	@PutMapping("/fabricantes/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name = "codigo") Long codigo, @RequestBody Fabricante fabricante) {
		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();
		
		fabricante_seleccionado = fabricanteServiceImpl.fabricanteXCodigo(codigo);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		return fabricante_actualizado;
	}
	
	// Eliminar fabricante por codigo
	@DeleteMapping("/fabricante/{codigo}")
	public void eliminarFabricante(@PathVariable(name = "codigo") Long codigo) {
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}
}
