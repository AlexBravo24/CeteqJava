package com;

public class Television {
	private String marca;
	private String color;
	private double pulgadas;
	
	//variables para composicion 
	private Pantalla pant;
	private Procesador1 pr;
	private Conectividad conec;
	
	//Constructores
	public Television() {
		
	}

	public Television(String marca, String color, double pulgadas, Pantalla pant, Procesador1 pr, Conectividad conec) {
		super();
		this.marca = marca;
		this.color = color;
		this.pulgadas = pulgadas;
		this.pant = pant;
		this.pr = pr;
		this.conec = conec;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public Pantalla getPant() {
		return pant;
	}

	public void setPant(Pantalla pant) {
		this.pant = pant;
	}

	public Procesador1 getPr() {
		return pr;
	}

	public void setPr(Procesador1 pr) {
		this.pr = pr;
	}

	public Conectividad getConec() {
		return conec;
	}

	public void setConec(Conectividad conec) {
		this.conec = conec;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", color=" + color + ", pulgadas=" + pulgadas + ", pant=" + pant + ", pr="
				+ pr + ", conec=" + conec + "]";
	}

	



}
