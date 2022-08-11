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

import com.example.demo.dto.Departamento;
import com.example.demo.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	// Listamos departamentos
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	// Listamos departamentos por nombre
	@GetMapping("/departamentos/nombre/{nombre}")
	public List<Departamento> listarDepartamentoNombre(@PathVariable(name ="nombre") String nombre){
		return departamentoServiceImpl.listarDepartamentoNombre(nombre);
	}
	
	// Posteamos un departamento
	@PostMapping("/departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	// Listamos departamentos por codigo
	@GetMapping("/departamentos/{codigo}")
	public Departamento departamentoXCodigo(@PathVariable(name="codigo") Long codigo) {
		Departamento departamento_x_id = new Departamento();
		departamento_x_id = departamentoServiceImpl.departamentoXCodigo(codigo);
		return departamento_x_id;
	}
	
	// Actualizamos departamentos por ID
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name = "codigo") Long codigo, @RequestBody Departamento departamento) {
		Departamento departamento_seleccionado = new Departamento();
		Departamento departamento_actualizado = new Departamento();
		
		departamento_seleccionado = departamentoServiceImpl.departamentoXCodigo(codigo);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamento_actualizado = departamentoServiceImpl.actualizarDepartamento(departamento_seleccionado);
		
		return departamento_actualizado;
	}
	
	// Eliminar departamento por codigo
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name = "codigo") Long codigo) {
		departamentoServiceImpl.eliminarDepartamento(codigo);
	}
}
