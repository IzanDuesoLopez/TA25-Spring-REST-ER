package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DepartamentoServiceImpl;
import com.example.demo.service.EmpleadoServiceImpl;
import com.example.demo.dto.Empleado;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	// Listamos todos los empleados
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	// Listamos empleados por nombre
	@GetMapping("/empleados/nombre/{nombre}")
	public List<Empleado> listarEmpleadoNombre(@PathVariable(name="nombre") String nombre){
		return empleadoServiceImpl.listarEmpleadoNombre(nombre);
	}
	
	// Posteamos un empleado
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	// Listamos empleados por DNI
	@GetMapping("/empleados/{dni}")
	public Empleado empleadoXDni(@PathVariable(name="dni") String dni) {
		Empleado empleado_x_dni = new Empleado();
		empleado_x_dni = empleadoServiceImpl.empleadoXDni(dni);
		return empleado_x_dni;
	}
	
	// Actualizamos empleados por dni
	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleado empleado) {
		Empleado empleado_seleccionado = new Empleado();
		Empleado empleado_actualizado = new Empleado();
		
		empleado_seleccionado = empleadoServiceImpl.empleadoXDni(dni);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellido(empleado.getApellido());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		empleado_actualizado = empleadoServiceImpl.actualizarEmpleado(empleado_seleccionado);
		
		return empleado_actualizado;
	}
}
