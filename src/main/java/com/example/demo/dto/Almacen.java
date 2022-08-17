package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="almacenes")
public class Almacen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name="lugar")
	private String lugar;
	@Column(name="capacidad")
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name="codigo_almacen")
	private List<Caja> caja;
	
	// Constructor default
	public Almacen() {
		
	}

	
	/**
	 * Constructor full params
	 * @param codigo
	 * @param lugar
	 * @param capacidad
	 * @param caja
	 */
	public Almacen(int codigo, String lugar, int capacidad, List<Caja> caja) {
		this.codigo = codigo;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}


	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}


	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	/**
	 * @param caja the caja to set
	 */
	public void setCaja(List<Caja> caja) {
		this.caja = caja;
	}

	/**
	 * Devolvemos caja
	 * @return
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCaja(){
		return caja;
	}
	

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
	
}
