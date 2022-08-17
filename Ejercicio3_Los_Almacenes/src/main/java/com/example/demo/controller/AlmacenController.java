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

import com.example.demo.dto.Almacen;
import com.example.demo.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServiceImpl almacenServiceImpl;
	
	// Todos los metodos del FULL CRUD
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenServiceImpl.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/nombre/{nombre}")
	public List<Almacen> listarAlmacanesNombre(@PathVariable(name="nombre") String nombre){
		return almacenServiceImpl.listarAlmacenNombre(nombre);
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenServiceImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen almacenXCodigo(@PathVariable(name="codigo") int codigo) {
		Almacen almacen = new Almacen();
		almacen = almacenServiceImpl.almacenXCodigo(codigo);
		return almacen;
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo") int codigo, @RequestBody Almacen almacen) {
		Almacen almacen_seleccionado = new Almacen();
		Almacen almacen_actualizado = new Almacen();
		
		almacen_seleccionado = almacenServiceImpl.almacenXCodigo(codigo);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_actualizado.setCapacidad(almacen.getCapacidad());
		
		almacen_actualizado = almacenServiceImpl.actualizarAlmacen(almacen_seleccionado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name = "codigo") int codigo) {
		almacenServiceImpl.eliminarAlmacen(codigo);
	}
}
