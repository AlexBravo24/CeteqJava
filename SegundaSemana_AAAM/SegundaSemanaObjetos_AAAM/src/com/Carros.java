package com;

public class Carros {

	private String modelo;
	private String color;
	private double precio;
	
	public Carros() {
		
	}

	public Carros(String modelo, String color, double precio) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Carros [modelo=" + modelo + ", color=" + color + ", precio=" + precio + "]";
	}

	
	
}