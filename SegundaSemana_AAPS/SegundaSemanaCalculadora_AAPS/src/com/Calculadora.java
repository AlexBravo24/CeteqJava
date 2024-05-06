package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private int digitos;
	
	public Calculadora () {
	}

	public Calculadora(String marca, String color, int digitos) {
		super();
		this.marca = marca;
		this.color = color;
		this.digitos = digitos;
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

	public int getDigitos() {
		return digitos;
	}

	public void setDigitos(int digitos) {
		this.digitos = digitos;
	}

	@Override
	public String toString() {
		return "Calculadora [marca= " + marca + ", color= " + color + ", digitos= " + digitos + "]";
	}
	
	public abstract void sumar (int a, int b);

	public abstract void restar (int a, int b);
	
	public abstract void multiplicar (int a, int b);
	
	public abstract void dividir (int a, int b);
}
