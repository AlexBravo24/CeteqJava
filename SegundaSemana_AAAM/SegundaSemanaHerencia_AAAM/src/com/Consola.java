package com;

public class Consola {

	private String marca;
	private String nombre;
	private double precio;
	
	public Consola() {}

	public Consola(String marca, String nombre, double precio) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Consola [marca=" + marca + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
}
