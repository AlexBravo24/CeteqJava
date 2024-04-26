package com;

public class Celular {

	//1.Definir atributos
	
	private String marca; 
	private String modelo;
	private String color;
	private double precio;
	
	//2.Crear contructores
	
	public Celular () {
	
	}

	public Celular(String marca, String modelo, String color, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + "]";
	}
	
	//3. Generar constructor con todos los parámetros dando clic derecho (SOURCE)
	//Generate Constructor Using Fields
	
	//4. Después de realizar el paso 3, general getter y setter, dar clic derecho
	//(SOURCE) Generate Getters and Setters (marcar todos los atributos)
	
	//5. Finalmente realizamos la creación método string (clic derecho, SOURCE) 
	//Generate toString ()
	
	
	
	
	
}