package com;

public class Moto extends Transporte {
	
	private int a�o;
	private int cilindraje;
	
	public Moto () {}

	public Moto(String modelo, String color, double velocidad, String matricula, int a�o, int cilindraje) {
		super(modelo, color, velocidad, matricula);
		this.a�o = a�o;
		this.cilindraje = cilindraje;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "Moto [a�o=" + a�o + ", cilindraje=" + cilindraje + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
