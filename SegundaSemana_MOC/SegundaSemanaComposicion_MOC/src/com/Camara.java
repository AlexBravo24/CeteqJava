package com;

public class Camara {
	private String marca;
	private double tamaņoLente;
	private double megapx;
	
	public Camara() {
		
	}

	public Camara(String marca, double tamaņoLente, double megapx) {
		super();
		this.marca = marca;
		this.tamaņoLente = tamaņoLente;
		this.megapx = megapx;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamaņoLente() {
		return tamaņoLente;
	}

	public void setTamaņoLente(double tamaņoLente) {
		this.tamaņoLente = tamaņoLente;
	}

	public double getMegapx() {
		return megapx;
	}

	public void setMegapx(double megapx) {
		this.megapx = megapx;
	}

	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", tamaņoLente=" + tamaņoLente + ", megapx=" + megapx + "]";
	}
	

}
