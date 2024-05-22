package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private String tipoDeCarga;
	private String pantalla;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String color, String tipoDeCarga, String pantalla) {
		super();
		this.marca = marca;
		this.color = color;
		this.tipoDeCarga = tipoDeCarga;
		this.pantalla = pantalla;
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

	public String getTipoDeCarga() {
		return tipoDeCarga;
	}

	public void setTipoDeCarga(String tipoDeCarga) {
		this.tipoDeCarga = tipoDeCarga;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ",\n tipoDeCarga=" + tipoDeCarga + ", pantalla="
				+ pantalla + "]";
	}
	
	public abstract void sumar (int n1, int n2);
	public abstract void restar (int n1, int n2);
	public abstract void multiplicar (int n1, int n2);
	public abstract void dividir (int n1, int n2);

}
