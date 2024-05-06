package com;

public class Auto {

	private String marca;
	private String color;
	private int año;
	
	// Método constructor vacío
	public Auto () {
		
	}
	
	// Método constructor con todos los parámeteros
	public Auto(String marca, String color, int año) {
		super();
		this.marca = marca;
		this.color = color;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", año=" + año + "]";
	}
}
