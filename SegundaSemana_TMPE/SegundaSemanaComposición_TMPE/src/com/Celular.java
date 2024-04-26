package com;

public class Celular {
	
	private String marca;
	private String model;
	private String color;

	//Estos son objetos que en realidad son atributos 
	//también de mi celular
	private Camara cam;
	private Procesador cpu;
	private Ram memoria;

	public Celular () {}

	public Celular(String marca, String model, String color, Camara cam, Procesador cpu, Ram memoria) {
		super();
		this.marca = marca;
		this.model = model;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Ram getMemoria() {
		return memoria;
	}

	public void setMemoria(Ram memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", model=" + model + ", color=" + color + ", cam=" + cam + ", cpu=" + cpu
				+ ", memoria=" + memoria + "]";
	}
	
	//Nota: Generar el constructor con todos los parametros, clic derecho (Suerce)
	//Generate Constructor Using Fields
	
	//Nota: Después dar clic derecho, (source) Generate Getters and Setters
	
	//Nota: Finalmente clic derecho, (source) Generate to String 
	
	
}
