package com;

public class Animal extends Mascota {
	
	private String animal;
	private String color;
	private int patas;
	
	
	public Animal () {}


	public Animal(String raza, String tamaño, double peso, String animal, String color, int patas) {
		super(raza, tamaño, peso);
		this.animal = animal;
		this.color = color;
		this.patas = patas;
	}


	public String getAnimal() {
		return animal;
	}


	public void setAnimal(String animal) {
		this.animal = animal;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPatas() {
		return patas;
	}


	public void setPatas(int patas) {
		this.patas = patas;
	}


	@Override
	public String toString() {
		return "Animal [animal=" + animal + ", color=" + color + ", patas=" + patas + ", getRaza()=" + getRaza()
				+ ", getTamaño()=" + getTamaño() + ", getPeso()=" + getPeso() + "]";
	}
	
	
	

}
