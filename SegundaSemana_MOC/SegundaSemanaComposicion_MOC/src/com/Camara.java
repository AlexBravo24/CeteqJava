package com;

public class Camara {
	private String marca;
	private double tamañoLente;
	private double megapx;
	
	public Camara() {
		
	}

	public Camara(String marca, double tamañoLente, double megapx) {
		super();
		this.marca = marca;
		this.tamañoLente = tamañoLente;
		this.megapx = megapx;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamañoLente() {
		return tamañoLente;
	}

	public void setTamañoLente(double tamañoLente) {
		this.tamañoLente = tamañoLente;
	}

	public double getMegapx() {
		return megapx;
	}

	public void setMegapx(double megapx) {
		this.megapx = megapx;
	}

	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", tamañoLente=" + tamañoLente + ", megapx=" + megapx + "]";
	}
	

}
