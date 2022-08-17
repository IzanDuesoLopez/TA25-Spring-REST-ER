package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacenes() {
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen almacenXCodigo(int codigo) {
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public List<Almacen> listarAlmacenNombre(String nombre) {
		return iAlmacenDAO.findByNombre(nombre);
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int codigo) {
		iAlmacenDAO.deleteById(codigo);
		
	}

}
