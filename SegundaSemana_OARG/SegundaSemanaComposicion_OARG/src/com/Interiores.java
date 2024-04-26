package com;

public class Interiores {
	
	private String color;
	private String material;
	private int numeroDeAsientos;
	
	public Interiores() {}

	public Interiores(String color, String material, int numeroDeAsientos) {
		super();
		this.color = color;
		this.material = material;
		this.numeroDeAsientos = numeroDeAsientos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getNumeroDeAsientos() {
		return numeroDeAsientos;
	}

	public void setNumeroDeAsientos(int numeroDeAsientos) {
		this.numeroDeAsientos = numeroDeAsientos;
	}

	@Override
	public String toString() {
		return "Interiores [color=" + color + ", material=" + material + ", numeroDeAsientos=" + numeroDeAsientos + "]";
	}
	
	
	

}
