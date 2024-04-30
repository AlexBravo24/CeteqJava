package com;

public class Motocicletas {

	private String modelo;
	private String cC;
	private double precio;
	
	public Motocicletas() {
		
	}

	
	
		
	public Motocicletas(String modelo, String cC, double precio) {
		super();
		this.modelo = modelo;
		this.cC = cC;
		this.precio = precio;
	}



	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCC() {
		return cC;
	}

	public void setCC(String cC) {
		this.cC = cC;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Motocicletas [Modelo=" + modelo + ", CC=" + cC + ", Precio=" + precio + "]";
	}
	
	
	
	
}
