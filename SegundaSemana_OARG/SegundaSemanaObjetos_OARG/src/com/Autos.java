package com;

public class Autos {
	
	private String marca;
	private String color;
	private double precio;
	
	public Autos() {
		
		
	}

	public Autos(String marca, String color, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	
	

}
