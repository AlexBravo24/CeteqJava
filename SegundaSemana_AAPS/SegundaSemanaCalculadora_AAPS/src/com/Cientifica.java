package com;

public class Cientifica extends Calculadora implements ITermometro {

	public Cientifica() {
		super();
		// 
	}

	public Cientifica(String marca, String color, int digitos) {
		super(marca, color, digitos);
		// 
	}

	@Override
	public String toString() {
		return "Cientifica [toString()= " + super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es: " + (a+b));
	}

	@Override
	public void restar(int a, int b) {
		System.out.println("La resta es: " + (a-b));
		
	}

	@Override
	public void multiplicar(int a, int b) {
		System.out.println("La multiplicación es: " + (a*b));
		
	}

	@Override
	public void dividir(int a, int b) {
		System.out.println("La divisón es:" + (a/b));
		
	}

	@Override
	public void tomarTemp() {
		System.out.println("Temperatura ambiente normal");
		
	}
	
}
