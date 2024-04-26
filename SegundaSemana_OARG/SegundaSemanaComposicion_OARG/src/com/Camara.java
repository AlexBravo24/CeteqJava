package com;

public class Camara {

	private String marca;
	private double tamaņoLente;
	private double megapixeles;
	
	
	public Camara () {
		
		
	}


	public Camara(String marca, double tamaņoLente, double megapixeles) {
		super();
		this.marca = marca;
		this.tamaņoLente = tamaņoLente;
		this.megapixeles = megapixeles;
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


	public double getMegapixeles() {
		return megapixeles;
	}


	public void setMegapixeles(double megapixeles) {
		this.megapixeles = megapixeles;
	}


	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", tamaņoLente=" + tamaņoLente + ", megapixeles=" + megapixeles + "]";
	}
	
	
	
}
