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
@Table(name="peliculas")
public class Pelicula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	@Column(name="nombre")
	private String nombre;
	@Column(name="edad")
	private int edad;
	
	@OneToMany
	@JoinColumn(name="codigo_pelicula")
	private List<Sala> sala;
	
	// Default constructor
	
	public Pelicula() {
		
	}

	/**
	 * Constructor full params
	 * @param codigo
	 * @param nombre
	 * @param edad
	 * @param sala
	 */
	public Pelicula(int codigo, String nombre, int edad, List<Sala> sala) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.sala = sala;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the sala
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
	public List<Sala> getSala() {
		return sala;
	}

	/**
	 * @param sala the sala to set
	 */
	public void setSala(List<Sala> sala) {
		this.sala = sala;
	}
	
	

}
