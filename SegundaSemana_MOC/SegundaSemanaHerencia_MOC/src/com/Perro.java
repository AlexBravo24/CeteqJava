package com;

public class Perro extends Animal {
	private String raza;
	private String Tama�o;
	private String genero;
	
	public Perro() {
		
	}

	public Perro(String nombre1, int edad, String alimentacion, String raza, String tama�o, String genero) {
		super(nombre1, edad, alimentacion);
		this.raza = raza;
		Tama�o = tama�o;
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTama�o() {
		return Tama�o;
	}

	public void setTama�o(String tama�o) {
		Tama�o = tama�o;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", Tama�o=" + Tama�o + ", genero=" + genero + ", toString()=" + super.toString()
				+ "]";
	}
	
}
