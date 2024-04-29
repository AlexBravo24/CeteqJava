package com;

public class Animal {
	private String nombre1;
	private int edad;
	private String alimentacion;
	
	public Animal() {
		
	}

	public Animal(String nombre1, int edad, String alimentacion) {
		super();
		this.nombre1 = nombre1;
		this.edad = edad;
		this.alimentacion = alimentacion;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	@Override
	public String toString() {
		return "Animal [nombre1=" + nombre1 + ", edad=" + edad + ", alimentacion=" + alimentacion + "]";
	}
	
}
