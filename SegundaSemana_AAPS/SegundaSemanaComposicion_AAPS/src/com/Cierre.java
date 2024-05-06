package com;

public class Cierre {

	private double cantidad;
	private String material;
	
	public Cierre () {
		
	}

	public Cierre(double cantidad, String material) {
		super();
		this.cantidad = cantidad;
		this.material = material;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Cierre [cantidad=" + cantidad + ", material=" + material + "]";
	}
	
	
}
