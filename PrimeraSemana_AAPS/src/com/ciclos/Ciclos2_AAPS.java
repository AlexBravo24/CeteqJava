package com.ciclos;

import java.util.Scanner;

public class Ciclos2_AAPS {
	public static void main(String[] args) {
		// Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado,
		// hasta la iteraci�n deseada por el usuario.
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		int b;
		int r;
		
		System.out.println("Ingresa el n�mero el cual desees conocer la tabla: ");
		a=entrada.nextInt();
		
		System.out.println("Ingresa la iteraci�n hasta la que desees se multiplique n�mero anteriormente tecleado: ");
		b=entrada.nextInt();
		
		for (int i=1; i<=b; i++) {
			r = a*i;
			System.out.println(a + " por " + i + " igual a " + r);
		}
		
	}

}
