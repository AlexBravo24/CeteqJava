package com;

public class Trabajador {
	//Atributos
	public String area;
	public int salario;
	public int antiguedad;
	
	//constructores
	public Trabajador() {
		
	}

	public Trabajador(String area, int salario, int antiguedad) {
		super();
		this.area = area;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	//Getters &setters

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	//tostring

	@Override
	public String toString() {
		return "Trabajador [area=" + area + ", salario=" + salario + ", antiguedad=" + antiguedad + "]";
	}
	
	//tostring
	
	

}
