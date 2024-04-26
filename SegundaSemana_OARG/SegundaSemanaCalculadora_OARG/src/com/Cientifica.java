package com;

public  class  Cientifica extends Calculadora implements ITermometro{
	
	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String color, double precio) {
		super(marca, color, precio);
		// TODO Auto-generated constructor stub
	}

	


	
	@Override
	public void sumar(double a, double b) {
		System.out.println("La suma de "+a+ " + "+b+ " es: "+(a+b));
		
	}

	@Override
	public void restar(double a, double b) {
		System.out.println("La resta de " +a+ " - " +b+ " es: "+(a-b));
		
	}

	@Override
	public void multiplicar(double a, double b) {
		System.out.println("La multiplicación de "+a+ " * " + b+ " es: "+(a*b));
		
	}

	@Override
	public void dividir(double a, double b) {
		System.out.println("La division de "+a+ " / " + b+ " es: "+(a/b));
		
			
	}
	public void sumar (double a, double b, double c) {
	    System.out.println("La suma de "+a+" + "+b+" + "+c+" es: "+ (a+b+c));
	}
	public void restar (double a, double b, double c) {
	    System.out.println("La resta de "+a+" - "+b+" - "+c+" es: "+ (a-b-c));
	}
	public void multiplicar (double a, double b, double c) {
		System.out.println("La multiplicacion de "+a+" * "+b+" * "+c+" es: "+ (a*b*c));
		}
	public void dividir (double a, double b, double c) {
		System.out.println("La division de "+a+" / "+b+" / "+c+" es: "+ (a/b/c));
		}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura ambiente normal");
		
		
	}

	
}
