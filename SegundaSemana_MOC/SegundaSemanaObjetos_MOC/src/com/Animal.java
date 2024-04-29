package com;

public class Animal {
	
	//Atributos
	private String nombre1;
	private int edad;
	private String alimentacion;
	
	//Constructores
	public Animal(){
		
	}
	
	public Animal(String nombre, int edad, String alimentacion) {
		super();
		this.nombre1 = nombre;
		this.edad = edad;
		this.alimentacion = alimentacion;
	}
	
	//metodo to string

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
		return "Animal [nombre=" + nombre1 + ", edad=" + edad + ", alimentacion=" + alimentacion + "]";
	}


}
