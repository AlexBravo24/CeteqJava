package com;

public class Perro extends Animal {
	private String raza;
	private String Tamaño;
	private String genero;
	
	public Perro() {
		
	}

	public Perro(String nombre1, int edad, String alimentacion, String raza, String tamaño, String genero) {
		super(nombre1, edad, alimentacion);
		this.raza = raza;
		Tamaño = tamaño;
		this.genero = genero;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamaño() {
		return Tamaño;
	}

	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", Tamaño=" + Tamaño + ", genero=" + genero + ", toString()=" + super.toString()
				+ "]";
	}
	
}
