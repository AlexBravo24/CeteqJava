package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		System.out.println("Ingresa un n�mero: ");
		a = entrada.nextInt();
		
		int divisor = 2;
		
		int resultado = a/2;
		
		int residuo = a%divisor;
		
		if (residuo==0) {System.out.println("El n�mero ingreso es par"); 
		} else {System.out.println("El n�mero ingresado es impar");}
	}
		
}

