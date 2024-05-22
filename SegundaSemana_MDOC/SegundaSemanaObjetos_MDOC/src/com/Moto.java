package com;

public class Moto {
	
	private String marca;
	private String estilo;
	private String color;
	private int año;
	
	public Moto() {
		
	}

	public Moto(String marca, String estilo, String color, int año) {
		super();
		this.marca = marca;
		this.estilo = estilo;
		this.color = color;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", estilo=" + estilo + ", color=" + color + ", año=" + año + "]";
	}
	
	

}
