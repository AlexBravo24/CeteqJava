package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MDOC {
	
	public static void main(String[] args) {
		
		System.out.println("¡Hola! Éste programa te dirá qué número es mayor o si los dos números son iguales");
		
		System.out.println("Por favor, introduce el Primer valor: ");
		Scanner numero1 = new Scanner(System.in);
		int valor1 = numero1.nextInt();
		
		System.out.println("Por favor, introduce el Segundo valor: ");
		Scanner numero2 = new Scanner(System.in);
		int valor2 = numero2.nextInt();
		
		System.out.println("¡Gracias!");		
		
		
		if (valor1 == valor2) {
			
			System.out.println(valor1 + " y " + valor2 + " son números iguales" );
			
		}
		
		else if (valor1 < valor2) {
			
			System.out.println(valor1 + " es un número Menor que " + valor2);
			
		}
		
		else if (valor1 > valor2) {
			
			System.out.println(valor1 + " es un número Mayor que " + valor2);
			
		}


		
	}

}
