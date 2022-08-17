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

import com.example.demo.dto.Caja;
import com.example.demo.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	// Todos los metodos del FULL CRUD
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajaServiceImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaServiceImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{codigo}")
	public Caja cajaXCodigo(@PathVariable(name="codigo") String codigo) {
		Caja caja = new Caja();
		caja = cajaServiceImpl.cajaXCodigo(codigo);
		return caja;
	}
	
	@PutMapping("/cajas/{codigo}")
	public Caja actualizarCaja(@PathVariable(name="codigo") String codigo, @RequestBody Caja caja) {
		Caja caja_seleccionado = new Caja();
		Caja caja_actualizado = new Caja();
		
		caja_seleccionado = cajaServiceImpl.cajaXCodigo(codigo);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		
		caja_actualizado = cajaServiceImpl.actualizarCaja(caja_seleccionado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{codigo}")
	public void eliminarCaja(@PathVariable(name = "codigo") String codigo) {
		cajaServiceImpl.eliminarCaja(codigo);
	}
}
