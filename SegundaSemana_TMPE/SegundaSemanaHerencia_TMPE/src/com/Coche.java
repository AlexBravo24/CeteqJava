package com;

public class Coche extends Transporte {

	private int cantidad_de_puertas;
	private double tamaño_de_llanta;
	private int cilindraje;
	
	public Coche (String string, String string2, int i, String string3, String string4, int j, int k) {}

	public Coche(String modelo, String color, double velocidad, String matricula, int cantidad_de_puertas,
			double tamaño_de_llanta, int cilindraje) {
		super(modelo, color, velocidad, matricula);
		this.cantidad_de_puertas = cantidad_de_puertas;
		this.tamaño_de_llanta = tamaño_de_llanta;
		this.cilindraje = cilindraje;
	}

	public int getCantidad_de_puertas() {
		return cantidad_de_puertas;
	}

	public void setCantidad_de_puertas(int cantidad_de_puertas) {
		this.cantidad_de_puertas = cantidad_de_puertas;
	}

	public double getTamaño_de_llanta() {
		return tamaño_de_llanta;
	}

	public void setTamaño_de_llanta(double tamaño_de_llanta) {
		this.tamaño_de_llanta = tamaño_de_llanta;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	@Override
	public String toString() {
		return "Coche [cantidad_de_puertas=" + cantidad_de_puertas + ", tamaño_de_llanta=" + tamaño_de_llanta
				+ ", cilindraje=" + cilindraje + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
