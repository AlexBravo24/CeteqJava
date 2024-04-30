package com;

public class Cigarros {

	private String marca;
	private int numeroDeCigarros;
	private double precio;
	
	public Cigarros() {
		
	}

	public Cigarros(String marca, int numeroDeCigarros, double precio) {
		super();
		this.marca = marca;
		this.numeroDeCigarros = numeroDeCigarros;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeroDeCigarros() {
		return numeroDeCigarros;
	}

	public void setNumeroDeCigarros(int numeroDeCigarros) {
		this.numeroDeCigarros = numeroDeCigarros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cigarros [marca=" + marca + ", numeroDeCigarros=" + numeroDeCigarros + ", precio=" + precio + "]";
	}
	
	
}
