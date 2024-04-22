package com.condicionales;

import java.util.Scanner;

public class Condicionales2_MDOC {

	public static void main(String[] args) {
		
		
		System.out.println("¡Hola! Éste programa te dirá si el número es Par o Impar");
		
		System.out.println("Por favor, introduce el valor: ");
		Scanner numero1 = new Scanner(System.in);
		int valor1 = numero1.nextInt();
		
		byte n = 2;
		
		int residuo = valor1%n; 
		
		if (residuo>0) {
			
			System.out.println("El " + valor1 + " es un número Impar");
			
		}
		
		else if (residuo==0) {
			
			System.out.println("El " + valor1 + " es un número Par");
			
		}
		
				

	}

}
