package com;

public class Cilindraje {

	private int cilindrada;
	private int numCilindros;
	private String potencia;
	
	public Cilindraje() {}

	public Cilindraje(int cilindrada, int numCilindros, String potencia) {
		super();
		this.cilindrada = cilindrada;
		this.numCilindros = numCilindros;
		this.potencia = potencia;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getNumCilindros() {
		return numCilindros;
	}

	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Cilindraje [cilindrada=" + cilindrada + ", numCilindros=" + numCilindros + ", potencia=" + potencia
				+ "]";
	}
	
	
	
}
