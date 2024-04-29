package com;

public class Pantalla {
	private String tecnologia;
	private String tipo;
	private double tamaño;
	
	public Pantalla() {
		
	}

	public Pantalla(String tecnologia, String tipo, double tamaño) {
		super();
		this.tecnologia = tecnologia;
		this.tipo = tipo;
		this.tamaño = tamaño;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Pantalla [tecnologia=" + tecnologia + ", tipo=" + tipo + ", tamaño=" + tamaño + "]";
	}
	
}
