package com;

public class Celular {
	
	private String marca;
	private String modelo;
	private String color;
	
	//Estos son objetos que en realidad son atributos de mi celular
	
	private Camara cam;
	private Ram cpu;
	private Procesador memoria;
	
	public Celular(){
		
	
	
	}

	public Celular(String marca, String modelo, String color, Camara cam, Ram cpu, Procesador memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cam = cam;
		this.cpu = cpu;
		this.memoria = memoria;
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

	public Camara getCam() {
		return cam;
	}

	public void setCam(Camara cam) {
		this.cam = cam;
	}

	public Ram getCpu() {
		return cpu;
	}

	public void setCpu(Ram cpu) {
		this.cpu = cpu;
	}

	public Procesador getMemoria() {
		return memoria;
	}

	public void setMemoria(Procesador memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cam=" + cam + ", cpu=" + cpu
				+ ", memoria=" + memoria + "]";
	}
	
	
	}
	


