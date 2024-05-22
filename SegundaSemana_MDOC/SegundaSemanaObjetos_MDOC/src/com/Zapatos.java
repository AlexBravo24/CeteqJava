package com;

public class Zapatos {
	
	private String modelo;
	private String color;
	private int talla;
	
	public Zapatos () {
		
	}

	public Zapatos(String modelo, String color, int talla) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.talla = talla;
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

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Zapatos [modelo=" + modelo + ", color=" + color + ", talla=" + talla + "]";
	}
	
	

}
