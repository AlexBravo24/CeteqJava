package com;

public class Mascota {
	
	private String raza;
	private String tama�o;
	private double peso;
	
	
	public Mascota () {}


	public Mascota(String raza, String tama�o, double peso) {
		super();
		this.raza = raza;
		this.tama�o = tama�o;
		this.peso = peso;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", tama�o=" + tama�o + ", peso=" + peso + "]";
	}
	
	
	

}
