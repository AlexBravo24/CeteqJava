package com;

public class Calzado {

	private String marca;
	private String color;
	private double talla;
	
	// M�todo constructor vac�o
	
	public Calzado () {
	
	}

	// M�todo constructor con todos los par�metros
	public Calzado(String marca, String color, double talla) {
		super();
		this.marca = marca;
		this.color = color;
		this.talla = talla;
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

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Calzado [marca=" + marca + ", color=" + color + ", talla=" + talla + "]";
	}
}
