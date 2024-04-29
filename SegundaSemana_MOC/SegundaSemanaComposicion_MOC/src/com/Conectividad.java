package com;

public class Conectividad {
	private String tipo;
	private double numerodepuertos;
	private String smart;
	
	
	public Conectividad() {
		
	}


	public Conectividad(String tipo, double numerodepuertos, String smart) {
		super();
		this.tipo = tipo;
		this.numerodepuertos = numerodepuertos;
		this.smart = smart;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getNumerodepuertos() {
		return numerodepuertos;
	}


	public void setNumerodepuertos(double numerodepuertos) {
		this.numerodepuertos = numerodepuertos;
	}


	public String getSmart() {
		return smart;
	}


	public void setSmart(String smart) {
		this.smart = smart;
	}


	@Override
	public String toString() {
		return "Conectividad [tipo=" + tipo + ", numerodepuertos=" + numerodepuertos + ", smart=" + smart + "]";
	}


	
	
}
