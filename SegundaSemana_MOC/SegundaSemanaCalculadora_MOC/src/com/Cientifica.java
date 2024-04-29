package com;

public class Cientifica extends Calculadora implements ITermometro {
	private String modelo;
	private int numerodedigitos;
	private String pantalla;
	
	public Cientifica() {
		
	}

	public Cientifica(String modelo, int numerodedigitos, String pantalla) {
		super();
		this.modelo = modelo;
		this.numerodedigitos = numerodedigitos;
		this.pantalla = pantalla;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumerodedigitos() {
		return numerodedigitos;
	}

	public void setNumerodedigitos(int numerodedigitos) {
		this.numerodedigitos = numerodedigitos;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Cientifica [modelo=" + modelo + ", numerodedigitos=" + numerodedigitos + ", pantalla=" + pantalla + "]";
	}

	@Override
	public void sumar(int a, int b) {
		System.out.println("El resultado de la suma es: "+ (a+b));
		
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("El resultado de la resta es: "+ (a-b));
	}

	@Override
	public void multiplicar(int a, int b) {
	System.out.println("El resultado de la multiplicacion es: "+ (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
	System.out.println("El resultado de la división es: "+ (a/b));
		
	}
	
	public void sumar(int a, int b,int c) {
		System.out.println("La suma es: "+ (a+b+c));
	}
	
	public void restar(int a, int b,int c) {
		System.out.println("La resta es: "+ (a-b-c));
	}
	
	public void multiplicar(int a, int b,int c) {
		System.out.println("El resultado de la multiplicación es: "+ (a*b*c));
	}
	public void dividir(int a, int b,int c) {
		System.out.println("El resultado de la división es: "+ (a/b/c));
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura ambiente normal");
		
	}
	
	
	
	
	
}
