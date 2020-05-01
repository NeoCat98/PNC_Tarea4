package com.uca.capas.domain;


import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Pattern(regexp="[1-9]{1}[0-9]{11}", message="El codigo debe de tener 12 dígitos exactos")
	private String codigo;
	
	@Size(min=1,max=100,message="El nombre del producto debe de tener como mínimo 1 caracter y como máximo 100 caracteres")
	private String nombre;
	
	@Size(min=1,max=100,message="La marca del producto debe de tener como mínimo 1 caracter y como máximo 100 caracteres")
	private String marca;
	
	@Size(min=1,max=500,message="La descripción del producto debe de tener como mínimo 1 caracter y como máximo 500 caracteres")
	private String descripcion;
	
	@Pattern(regexp="^\\d+$", message="Las existencias del producto deben de ser números sin decimales")
	private String existencias;
	
	@Pattern(regexp="^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message="la fecha debe estar en formato dd/mm/yyyy")
	private String fecha;
	
	public Producto() {
		
	}

	public Producto(String codigo, String nombre, String marca, String descripcion, String existencias, String fecha) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.existencias = existencias;
		this.fecha = fecha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExistencias() {
		return existencias;
	}

	public void setExistencias(String existencias) {
		this.existencias = existencias;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
