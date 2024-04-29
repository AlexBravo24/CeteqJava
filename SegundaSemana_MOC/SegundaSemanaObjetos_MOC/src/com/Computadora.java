package com;

public class Computadora {
	//Atributos
	public String marca;
	public String color;
	public int precio;
	
	//constructores
	public Computadora() {
		
	}

	public Computadora(String marca, String color, int precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}
	// getters & setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//to string

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	 
	
	
	

}
