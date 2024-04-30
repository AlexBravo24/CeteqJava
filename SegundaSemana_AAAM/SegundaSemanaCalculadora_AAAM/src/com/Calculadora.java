package com;

public abstract class Calculadora {

	private String marca;
	private String color;
	private double precio;
	public Calculadora(String marca, String color, double precio) {
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
		return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	
	public abstract void suma(int a, int b);
	public abstract void resta(int c, int d);
	public abstract void multiplicacion(int e, int f);
	public abstract void division(int g, int h);
	
	
	
}
