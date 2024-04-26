package com;

public class Mascota {
	
	private String raza;
	private String tamaño;
	private double peso;
	
	
	public Mascota () {}


	public Mascota(String raza, String tamaño, double peso) {
		super();
		this.raza = raza;
		this.tamaño = tamaño;
		this.peso = peso;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getTamaño() {
		return tamaño;
	}


	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", tamaño=" + tamaño + ", peso=" + peso + "]";
	}
	
	
	

}
