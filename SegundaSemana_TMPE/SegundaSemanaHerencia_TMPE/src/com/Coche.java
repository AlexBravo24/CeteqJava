package com;

public class Coche extends Transporte {

	private int cantidad_de_puertas;
	private double tama�o_de_llanta;
	private int cilindraje;
	
	public Coche (String string, String string2, int i, String string3, String string4, int j, int k) {}

	public Coche(String modelo, String color, double velocidad, String matricula, int cantidad_de_puertas,
			double tama�o_de_llanta, int cilindraje) {
		super(modelo, color, velocidad, matricula);
		this.cantidad_de_puertas = cantidad_de_puertas;
		this.tama�o_de_llanta = tama�o_de_llanta;
		this.cilindraje = cilindraje;
	}

	public int getCantidad_de_puertas() {
		return cantidad_de_puertas;
	}

	public void setCantidad_de_puertas(int cantidad_de_puertas) {
		this.cantidad_de_puertas = cantidad_de_puertas;
	}

	public double getTama�o_de_llanta() {
		return tama�o_de_llanta;
	}

	public void setTama�o_de_llanta(double tama�o_de_llanta) {
		this.tama�o_de_llanta = tama�o_de_llanta;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "Coche [cantidad_de_puertas=" + cantidad_de_puertas + ", tama�o_de_llanta=" + tama�o_de_llanta
				+ ", cilindraje=" + cilindraje + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
