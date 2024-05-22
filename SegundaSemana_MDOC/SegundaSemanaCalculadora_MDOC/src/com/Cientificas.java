package com;

import java.util.Scanner;

public class Cientificas extends Calculadora {

public Cientificas() {
		
	}
	
	public Cientificas (String marca, String color, String tipoDeCarga, String pantalla) {
		super(marca,color,tipoDeCarga,pantalla);
	}
	
	Scanner entrada = new Scanner(System.in);

	@Override
	public void sumar(int n1, int n2) {
		System.out.println("Ingresa los 2 valores a sumar separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();		
		System.out.println("La suma de "+ n1+ " m�s " + n2+ " es: " + (n1+n2));
	}
	
	public void sumar(int n1, int n2 , int n3) {
		System.out.println("Ingresa los 3 valores a sumar separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();	
		n3=entrada.nextInt();
		System.out.println("La suma de "+ n1+ " m�s " + n2+ " m�s " + n3+ " es: " + (n1+n2+n3));
	}

	@Override
	public void restar(int n1, int n2) {
		System.out.println("Ingresa los 2 valores a restar separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		System.out.println("La resta de "+ n1+ " menos " + n2+ " es: " + (n1-n2));
		
	}
	public void restar(int n1, int n2 , int n3) {
		System.out.println("Ingresa los 3 valores a restar separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();	
		n3=entrada.nextInt();
		System.out.println("La resta de "+ n1+ " menos " + n2+ " menos " + n3+ " es: " + (n1-n2-n3));
	}


	@Override
	public void multiplicar(int n1, int n2) {
		System.out.println("Ingresa los 2 valores a multiplicar separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		System.out.println("La multiplicaci�n de "+ n1+ " por " + n2+ " es: " + (n1*n2));
		
	}
	public void multiplicar(int n1, int n2 , int n3) {
		System.out.println("Ingresa los 3 valores a multiplicar separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();	
		n3=entrada.nextInt();
		System.out.println("La multiplicaci�n de "+ n1+ " por " + n2+ " por " + n3+ " es: " + (n1*n2*n3));
	}

	@Override
	public void dividir(int n1, int n2) {
		System.out.println("Ingresa los 2 a dividir separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();
		System.out.println("La divisi�n de "+ n1+ " entre " + n2+ " es: " + (n1/n2));
		
	}
	
	public void dividir(int n1, int n2 , int n3) {
		System.out.println("Ingresa los 3 valores a dividir separados con un 'Enter'");
		n1=entrada.nextInt();
		n2=entrada.nextInt();	
		n3=entrada.nextInt();
		System.out.println("La divisi� de "+ n1+ " entre " + n2+ " entre " + n3+ " es: " + (n1/n2/n3));
	}	
	

}
