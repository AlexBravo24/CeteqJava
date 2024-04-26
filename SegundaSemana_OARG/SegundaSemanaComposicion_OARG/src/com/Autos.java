package com;

public class Autos {
	
	private String marca;
	private String modelo;
	private String color;
	
	private Estereo estereo;
	private Llantas llantas;
	private Interiores inte;
	
	
	public Autos() {}


	public Autos(String marca, String modelo, String color, Estereo estereo, Llantas llantas, Interiores inte) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.estereo = estereo;
		this.llantas = llantas;
		this.inte = inte;
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


	public Estereo getEstereo() {
		return estereo;
	}


	public void setEstereo(Estereo estereo) {
		this.estereo = estereo;
	}


	public Llantas getLlantas() {
		return llantas;
	}


	public void setLlantas(Llantas llantas) {
		this.llantas = llantas;
	}


	public Interiores getInte() {
		return inte;
	}


	public void setInte(Interiores inte) {
		this.inte = inte;
	}


	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", Modelo=" + modelo + ", Color=" + color + ", Estereo=" + estereo
				+ ", Llantas=" + llantas + ", Inte=" + inte + "]";
	}
	

}
