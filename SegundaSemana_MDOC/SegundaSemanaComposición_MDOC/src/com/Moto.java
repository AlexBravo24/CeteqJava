package com;

public class Moto {
	
	private String marca;
	private String modelo;
	private String color;
	
	
	private Llantas ll;
	private Cilindraje cc;
	private Rendimiento ren;
	
	public Moto () {
		
	}

	public Moto(String marca, String modelo, String color, Llantas ll, Cilindraje cc, Rendimiento ren) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ll = ll;
		this.cc = cc;
		this.ren = ren;
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

	public Llantas getLl() {
		return ll;
	}

	public void setLl(Llantas ll) {
		this.ll = ll;
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

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", ll=" + ll + ", cc=" + cc
				+ ", ren=" + ren + "]";
	}
	

}