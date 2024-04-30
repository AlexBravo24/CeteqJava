package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{  //(implements + nombreDeLaInterface) para jalar la interfase a la clase hija
																	 //si ya hay un metodo abstracto en la interfase, marcara error el nombre de la clase hija, se debe poner el cursor ensima y jalar los metodos de la interfase
	

	
	public Cientifica(String marca, String color, double precio) {
		super(marca, color, precio);
	}

	

	@Override
	public void suma(int a, int b) {
		System.out.println("Introduce el primer numero a sumar:");
		Scanner entrada = new Scanner(System.in);
		a=entrada.nextInt();
		System.out.println("Introduce el segundo numero a sumar:");
		b=entrada.nextInt();
		System.out.println("El resultado es: " + (a+b) );
		
	}

	@Override
	public void resta(int c, int d) {
		System.out.println("Introduce el primer numero a restar:");
		Scanner entrada = new Scanner(System.in);
		c=entrada.nextInt();
		System.out.println("Introduce el segundo numero a restar:");
		d=entrada.nextInt();
		System.out.println("El resultado es: " + (c-d) );
		
	}

	@Override
	public void multiplicacion(int e, int f) {
		System.out.println("Introduce el primer numero a multiplicar:");
		Scanner entrada = new Scanner(System.in);
		e=entrada.nextInt();
		System.out.println("Introduce el segundo numero a multiplicar:");
		f=entrada.nextInt();
		System.out.println("El resultado es: " + (e*f) );
		
	}

	@Override
	public void division(int g, int h) {
		System.out.println("Introduce el primer numero a dividir:");
		Scanner entrada = new Scanner(System.in);
		g=entrada.nextInt();
		System.out.println("Introduce el segundo numero a dividir:");
		h=entrada.nextInt();
		System.out.println("El resultado es: " + (g/h) );
		
	}
	
    public void suma(int i, int j, int k) {
    	System.out.println("Introduce el primer numero a sumar:");
		Scanner entrada = new Scanner(System.in);
		i=entrada.nextInt();
		System.out.println("Introduce el segundo numero a sumar:");
		j=entrada.nextInt();
		System.out.println("Introduce el tercer numero a sumar:");
		k=entrada.nextInt();
		System.out.println("El resultado es: " + (i+j+k) );
    }
		
    public void resta(int l, int m, int n) {
		System.out.println("Introduce el primer numero a restar:");
		Scanner entrada = new Scanner(System.in);
		l=entrada.nextInt();
		System.out.println("Introduce el segundo numero a restar:");
		m=entrada.nextInt();
		System.out.println("Introduce el tercer numero a restar:");
		n=entrada.nextInt();
		System.out.println("El resultado es: " + (l-m-n) );
    }
    
    public void multiplicacion(int o, int p, int q) {
		System.out.println("Introduce el primer numero a multiplicar:");
		Scanner entrada = new Scanner(System.in);
		o=entrada.nextInt();
		System.out.println("Introduce el segundo numero a multiplicar:");
		p=entrada.nextInt();
		System.out.println("Introduce el tercer numero a multiplicar:");
		q=entrada.nextInt();
		System.out.println("El resultado es: " + (o*p*q) );
		
	}
    
	public void division(int r, int s, int t) {
		System.out.println("Introduce el primer numero a dividir:");
		Scanner entrada = new Scanner(System.in);
		r=entrada.nextInt();
		System.out.println("Introduce el segundo numero a dividir:");
		s=entrada.nextInt();
		System.out.println("Introduce el tercer numero a dividir:");
		t=entrada.nextInt();
		System.out.println("El resultado es: " + (r/s/t) );
		
	}



	@Override
	public void tomarTemperatura() {
		System.out.println("Tempertura ambiente normal");
		
	}
    
}
