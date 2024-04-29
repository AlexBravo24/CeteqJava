package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{
	
	
	public Cientifica() {
		
	}
	
	
	

//	public Cientifica(String string, String string2, String string3) {
//		// TODO Auto-generated constructor stub
	public Cientifica(String marca, String color, String precio) {
		super(marca, color, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		a = entrada.nextInt();
		System.out.println("Introduce el segundo valor");
		b = entrada.nextInt();
		System.out.println("la suma es: " + (a + b));
		entrada.close();
		
	}

	@Override
	public void restar(int a, int b) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		a = entrada.nextInt();
		System.out.println("Introduce el segundo valor");
		b = entrada.nextInt();
		System.out.println("la resta es: " + (a - b));
		entrada.close();
	}

	@Override
	public void dividir(int a, int b) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el Dividendo valor");
		a = entrada.nextInt();
		System.out.println("Introduce el Divisor valor");
		b = entrada.nextInt();
		System.out.println("la division es: " + (a / b));
		entrada.close();
	}

	@Override
	public void multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el multiplicando valor");
		a = entrada.nextInt();
		System.out.println("Introduce el multiplicador valor");
		b = entrada.nextInt();
		System.out.println("la multiplicacion es: " + (a * b));
		entrada.close();
	}




	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura ambiente normal");		
	}
	

}
