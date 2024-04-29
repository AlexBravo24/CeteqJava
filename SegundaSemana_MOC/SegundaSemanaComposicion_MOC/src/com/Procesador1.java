package com;

public class Procesador1 {
	private String marca;
	private String modelo;
	private double potencia;
	
	public Procesador1() {
		
	}

	public Procesador1(String marca, String modelo, double potencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
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

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Procesador1 [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + "]";
	} 
	
}
