package com;

public class Perros {
	
	private String raza;
	private String tamaño;
	private String color;
	
	public Perros() {
		
		
		

}

	public Perros(String raza, String tamaño, String color) {
		super();
		this.raza = raza;
		this.tamaño = tamaño;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Perros [raza=" + raza + ", tamaño=" + tamaño + ", color=" + color + "]";
	}
   
    
    	
    }


