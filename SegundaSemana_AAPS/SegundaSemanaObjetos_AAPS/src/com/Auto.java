package com;

public class Auto {

	private String marca;
	private String color;
	private int a�o;
	
	// M�todo constructor vac�o
	public Auto () {
		
	}
	
	// M�todo constructor con todos los par�meteros
	public Auto(String marca, String color, int a�o) {
		super();
		this.marca = marca;
		this.color = color;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", a�o=" + a�o + "]";
	}
}
