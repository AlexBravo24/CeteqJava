package com;

public class Motocicleta {

	private String marca;
	private String modelo;
	private String color;
	private Cilindraje cc;
	private Rendimiento ren;
	private Llanta llan;
	
	public Motocicleta() {}

	public Motocicleta(String marca, String modelo, String color, Cilindraje cc, Rendimiento ren, Llanta llan) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cc = cc;
		this.ren = ren;
		this.llan = llan;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cilindraje getCc() {
		return cc;
	}

	public void setCc(Cilindraje cc) {
		this.cc = cc;
	}

	public Rendimiento getRen() {
		return ren;
	}

	public void setRen(Rendimiento ren) {
		this.ren = ren;
	}

	public Llanta getLlan() {
		return llan;
	}

	public void setLlan(Llanta llan) {
		this.llan = llan;
	}

	@Override
	public String toString() {
		return "Motocicleta [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cc=" + cc + ", ren=" + ren
				+ ", llan=" + llan + "]";
	}

	
	
	
	
}
