package com;

public class Camara {
	private String marca;
	private double tama�oLente;
	private double megapx;
	
	public Camara() {
		
	}

	public Camara(String marca, double tama�oLente, double megapx) {
		super();
		this.marca = marca;
		this.tama�oLente = tama�oLente;
		this.megapx = megapx;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTama�oLente() {
		return tama�oLente;
	}

	public void setTama�oLente(double tama�oLente) {
		this.tama�oLente = tama�oLente;
	}

	public double getMegapx() {
		return megapx;
	}

	public void setMegapx(double megapx) {
		this.megapx = megapx;
	}

	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", tama�oLente=" + tama�oLente + ", megapx=" + megapx + "]";
	}
	

}
