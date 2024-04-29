package com;

public class Pantalla {
	private String tecnologia;
	private String tipo;
	private double tama�o;
	
	public Pantalla() {
		
	}

	public Pantalla(String tecnologia, String tipo, double tama�o) {
		super();
		this.tecnologia = tecnologia;
		this.tipo = tipo;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Pantalla [tecnologia=" + tecnologia + ", tipo=" + tipo + ", tama�o=" + tama�o + "]";
	}
	
}
