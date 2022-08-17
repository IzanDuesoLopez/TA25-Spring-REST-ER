package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class Caja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String num_referencia;
	@Column(name="contenido")
	private String contenido;
	@Column(name="valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="almacen")
	Almacen almacen;

	// Constructor default
	public Caja() {
		
	}

	/**
	 * Constructor full params
	 * @param num_referencia
	 * @param contenido
	 * @param valor
	 * @param almacen
	 */
	public Caja(String num_referencia, String contenido, int valor, Almacen almacen) {
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	/**
	 * @return the num_referencia
	 */
	public String getNum_referencia() {
		return num_referencia;
	}

	/**
	 * @param num_referencia the num_referencia to set
	 */
	public void setNum_referencia(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	/**
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * @param contenido the contenido to set
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the almacen
	 */
	public Almacen getAlmacen() {
		return almacen;
	}

	/**
	 * @param almacen the almacen to set
	 */
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}
}
