package com;

public class Perros {
	
	private String raza;
	private String tama�o;
	private String color;
	
	public Perros() {
		
		
		

}

	public Perros(String raza, String tama�o, String color) {
		super();
		this.raza = raza;
		this.tama�o = tama�o;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Perros [raza=" + raza + ", tama�o=" + tama�o + ", color=" + color + "]";
	}
   
    
    	
    }


