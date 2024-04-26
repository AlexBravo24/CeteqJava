package com;

public abstract class Calculadora {
	
	private String marca;
	private String color;
	private double precio;
	
	
	public Calculadora () {}

	public Calculadora(String marca, String color, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		;
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
	
	//Declaracion de metodos abstractos 
	public abstract void sumar(double a, double b);
	public abstract void restar(double a, double b);
	public abstract void multiplicar(double a ,double b);
	public abstract void dividir(double a ,double b);
	
	

}


