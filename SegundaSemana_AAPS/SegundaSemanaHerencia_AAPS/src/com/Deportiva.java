package com;

public class Deportiva extends Playera {

	private String actividad;
	private String departamento;
	private int pasillo;
	
	public Deportiva () {
	}

	public Deportiva(String color, String talla, int codigo, String actividad, String departamento, int pasillo) {
		super(color, talla, codigo);
		this.actividad = actividad;
		this.departamento = departamento;
		this.pasillo = pasillo;
	}

	public String getActividad() {
		return actividad;
	}

	public void setActividad(String actividad) {
		this.actividad = actividad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPasillo() {
		return pasillo;
	}

	public void setPasillo(int pasillo) {
		this.pasillo = pasillo;
	}

	@Override
	public String toString() {
		return "Deportiva [actividad=" + actividad + ",\n departamento=" + departamento + ",\n pasillo=" + pasillo
				+ ",\n toString()=" + super.toString() + "]";
	}	
}
