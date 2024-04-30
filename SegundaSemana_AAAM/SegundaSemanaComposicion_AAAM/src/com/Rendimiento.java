package com;

public class Rendimiento {
	
	private String combustible;
	private double autonomia;
	private String capacidadTanque;
	
	public Rendimiento() {}

	public Rendimiento(String combustible, double autonomia, String capacidadTanque) {
		super();
		this.combustible = combustible;
		this.autonomia = autonomia;
		this.capacidadTanque = capacidadTanque;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public double getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}

	public String getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(String capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}

	@Override
	public String toString() {
		return "Rendimiento [combustible=" + combustible + ", autonomia=" + autonomia + ", capacidadTanque="
				+ capacidadTanque + "]";
	}
	
	

}
