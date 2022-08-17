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

import com.example.demo.dto.Sala;
import com.example.demo.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	
	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	// Todos los metodos del FULL CRUD
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaServiceImpl.listarSalas();
	}
	
	@GetMapping("/salas/nombre/{nombre}")
	public List<Sala> listarSalaNombre(@PathVariable(name = "nombre") String nombre){
		return salaServiceImpl.listarSalaNombre(nombre);
	}
	
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		return salaServiceImpl.guardarSalas(sala);
	}
	
	@GetMapping("/salas/{codigo}")
	public Sala SalaXCodigo(@PathVariable(name="codigo") int codigo) {
		Sala sala = new Sala();
		sala = salaServiceImpl.salaXCodigo(codigo);
		return sala;
	}
	
	@PutMapping("/salas/{codigo}")
	public Sala actualizarSala(@PathVariable(name = "codigo") int codigo,@RequestBody Sala sala) {
		Sala sala_seleccionado = new Sala();
		Sala sala_actualizado = new Sala();

		sala_seleccionado = salaServiceImpl.salaXCodigo(codigo);

		sala_seleccionado.setNombre(sala.getNombre());

		sala_actualizado = salaServiceImpl.actualizarSala(sala_seleccionado);

		return sala_actualizado;
	}

	// Eliminar departamento por codigo
	@DeleteMapping("/salas/{codigo}")
	public void eliminarSala(@PathVariable(name = "codigo") int codigo) {
		salaServiceImpl.eliminarSala(codigo);
	}
	
}