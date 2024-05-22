package com;

public class Rendimiento {
	
	private int capacidad;
	private double kilporlitro;
	
	public Rendimiento () {
		
	}

	public Rendimiento(int capacidad, double kilporlitro) {
		super();
		this.capacidad = capacidad;
		this.kilporlitro = kilporlitro;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getKilporlitro() {
		return kilporlitro;
	}

	public void setKilporlitro(double kilporlitro) {
		this.kilporlitro = kilporlitro;
	}

	@Override
	public String toString() {
		return "Rendimiento [capacidad=" + capacidad + ", kilporlitro=" + kilporlitro + "]";
	}
	
	

}
