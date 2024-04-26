package com;

public class Llantas {
	
	private String marca;
	private String rodada;
	private int presion;
	
	
	public Llantas() {}


	public Llantas(String marca, String rodada, int presion) {
		super();
		this.marca = marca;
		this.rodada = rodada;
		this.presion = presion;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getRodada() {
		return rodada;
	}


	public void setRodada(String rodada) {
		this.rodada = rodada;
	}


	public int getPresion() {
		return presion;
	}


	public void setPresion(int presion) {
		this.presion = presion;
	}


	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", rodada=" + rodada + ", presion=" + presion + "]";
	}
	
	

}
