package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	
	// Metodos del crud Empleado
	public List<Empleado> listarEmpleados(); // Mostrar empleados
	
	public Empleado guardarEmpleado(Empleado empleado); // Guardamos empleado
	
	public Empleado empleadoXDni(String dni); // Datos por dni
	
	public List<Empleado> listarEmpleadoNombre(String nombre); // Listamos empleado por nombre
	
	public Empleado actualizarEmpleado(Empleado empleado); // Actualizar empleado UPDATE
	
	public void eliminarEmpleado(String dni); // Eliminar empleado por dni
}
