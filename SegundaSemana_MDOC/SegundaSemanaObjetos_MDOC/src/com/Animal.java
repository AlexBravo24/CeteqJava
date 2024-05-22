package com;

public class Animal {
	
	private String tipo;
	private String raza;
	private String color;
	private int edad;
	private String genero;
	
	public Animal () {
		
	}

	public Animal(String tipo, String raza, String color, int edad, String genero) {
		super();
		this.tipo = tipo;
		this.raza = raza;
		this.color = color;
		this.edad = edad;
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Animal [tipo=" + tipo + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", genero=" + genero
				+ "]";
	}
	
	

}
