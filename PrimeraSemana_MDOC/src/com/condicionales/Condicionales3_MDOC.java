package com.condicionales;

import java.util.Scanner;

public class Condicionales3_MDOC {

	public static void main(String[] args) {
		
		System.out.println("¡Hola! Éste programa te dirá el resultado de dividir dos números");
		
		System.out.println("Por favor, introduce el Primer valor: ");
		Scanner numero1 = new Scanner(System.in);
		int valor1 = numero1.nextInt();
		
		System.out.println("Por favor, introduce el Segundo valor: ");
		Scanner numero2 = new Scanner(System.in);
		int valor2 = numero2.nextInt();
		
		if (valor2==0) {
			System.out.println("¡Ups! recuerda que no podemos dividir entre cero, intenta una vez mas");
			
			System.out.println("Por favor, introduce el Segundo valor: ");
			Scanner numero3 = new Scanner(System.in);
			valor2 = numero3.nextInt();
			if (valor2==0) {
				System.out.println("¡Ups! No podemos dividir entre cero, no tienes más intentos");
			} else {
				System.out.println("¡Gracias!");					
				int res = valor1/valor2;
				System.out.println("El Resultado es: " + res);
			}
		} else {
			System.out.println("¡Gracias!");					
			int res = valor1/valor2;
			System.out.println("El Resultado es: " + res);
		}
		 
		
		
	}

}
