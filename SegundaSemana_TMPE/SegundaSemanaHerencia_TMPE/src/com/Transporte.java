package com;

public class Transporte {

	private String modelo;
	private String color;
	private double velocidad;
	private String matricula;
	
	public Transporte () {}

	public Transporte(String modelo, String color, double velocidad, String matricula) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;
		this.matricula = matricula;
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

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Transporte [modelo=" + modelo + ", color=" + color + ", velocidad=" + velocidad + ", matricula="
				+ matricula + "]";
	}
	
	
	
	
	
	
	
	
}
