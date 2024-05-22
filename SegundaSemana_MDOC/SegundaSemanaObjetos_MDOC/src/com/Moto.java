package com;

public class Moto {
	
	private String marca;
	private String estilo;
	private String color;
	private int a�o;
	
	public Moto() {
		
	}

	public Moto(String marca, String estilo, String color, int a�o) {
		super();
		this.marca = marca;
		this.estilo = estilo;
		this.color = color;
		this.a�o = a�o;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
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
		return "Moto [marca=" + marca + ", estilo=" + estilo + ", color=" + color + ", a�o=" + a�o + "]";
	}
	
	

}
