package com;

public class Llanta {

	private int numeLLantas;
	private String delantera;
	private String trasera;
	
	public Llanta () {}

	public Llanta(int numeLLantas, String delantera, String trasera) {
		super();
		this.numeLLantas = numeLLantas;
		this.delantera = delantera;
		this.trasera = trasera;
	}

	public int getNumeLLantas() {
		return numeLLantas;
	}

	public void setNumeLLantas(int numeLLantas) {
		this.numeLLantas = numeLLantas;
	}

	public String getDelantera() {
		return delantera;
	}

	public void setDelantera(String delantera) {
		this.delantera = delantera;
	}

	public String getTrasera() {
		return trasera;
	}

	public void setTrasera(String trasera) {
		this.trasera = trasera;
	}

	@Override
	public String toString() {
		return "Llanta [numeLLantas=" + numeLLantas + ", delantera=" + delantera + ", trasera=" + trasera + "]";
	}
	
	
	
	
	
	
}
