package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Caja;

public interface ICajaService {

	// Metodos para el full crud
	public List<Caja> listarCajas();
	public Caja guardarCaja(Caja caja);
	public Caja almacenXCodigo(String codigo);
	public Caja actualizarCaja(Caja caja);
	public void eliminarCaja(String codigo);
	
}
