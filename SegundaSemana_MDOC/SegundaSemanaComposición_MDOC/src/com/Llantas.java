package com;

public class Llantas {
	
	private String marca;
	private String tipo;
	private double calibre;
	
	public Llantas () {
		
	}

	public Llantas(String marca, String tipo, double calibre) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.calibre = calibre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCalibre() {
		return calibre;
	}

	public void setCalibre(double calibre) {
		this.calibre = calibre;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", tipo=" + tipo + ", calibre=" + calibre + "]";
	}
	

}
