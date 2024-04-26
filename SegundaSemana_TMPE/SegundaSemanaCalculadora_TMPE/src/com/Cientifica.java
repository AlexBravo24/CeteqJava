package com;

public class Cientifica extends Calculadora implements ITermometro {

	
	public Cientifica(String marca, String color, double precio) {
	super(marca,color,precio);
	}
	
	public void sumar(int a, int b) {
		System.out.println("El resultado de la suma es:" + (a+b));
		
	}


	@Override
	public void sumar(int a, int b, int c) {
		System.out.println("El resultado de la suma es:" + (a+b+c));
		
	}
	
	

	@Override
	public void restar(int a, int b, int c) {
		System.out.println("El resultado de la resta es:" + (a-b-c));
		
	}
	
	public void restar(int a, int b) {
		System.out.println("El resultado de la resta es:" + (a-b));
		
	}

	@Override
	public void multiplicar(int a, int b, int c) {
		System.out.println("El resultado de la multiplicacion es:" + (a*b*c));
		
	}
	
	public void multiplicar(int a, int b) {
		System.out.println("El resultado de la multiplicacion es:" + (a*b));
		
	}

	@Override
	public void dividir(int a, int b, int c) {
		System.out.println("El resultado de la division es:" + (a / b / c));
		
	}
	
	public void dividir(int a, int b) {
		System.out.println("El resultado de la division es:" + (a / b ));
		
	}

	@Override
	public void tomarTemeratura() {
		System.out.println("Temperatura ambiente normal");
		
	}
	
	
	
	

	
	
	
	
}
