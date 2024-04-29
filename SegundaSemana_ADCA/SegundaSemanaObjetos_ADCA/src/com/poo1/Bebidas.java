package com.poo1;

public class Bebidas {
	
	private String sabor;
	private double precio;
	private double contenido;
	private String materialEnbase;
	
	public Bebidas() {
		
	}

	public Bebidas(String sabor, double precio, double contenido, String materialEnbase) {
		super();
		this.sabor = sabor;
		this.precio = precio;
		this.contenido = contenido;
		this.materialEnbase = materialEnbase;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}

	public String getMaterialEnbase() {
		return materialEnbase;
	}

	public void setMaterialEnbase(String materialEnbase) {
		this.materialEnbase = materialEnbase;
	}

	@Override
	public String toString() {
		return "Bebidas [sabor=" + sabor + ", precio=" + precio + ", contenido=" + contenido + ", materialEnbase="
				+ materialEnbase + "]";
	}
	

}
