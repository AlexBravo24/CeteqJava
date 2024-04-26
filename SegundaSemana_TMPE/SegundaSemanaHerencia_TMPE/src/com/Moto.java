package com;

public class Moto extends Transporte {
	
	private int año;
	private int cilindraje;
	
	public Moto () {}

	public Moto(String modelo, String color, double velocidad, String matricula, int año, int cilindraje) {
		super(modelo, color, velocidad, matricula);
		this.año = año;
		this.cilindraje = cilindraje;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "Moto [año=" + año + ", cilindraje=" + cilindraje + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
