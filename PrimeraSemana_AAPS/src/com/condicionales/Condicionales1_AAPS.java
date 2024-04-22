package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que reciba dos numeros por teclado e indique cual es mayor o si son iguales

		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		int b;
		
		System.out.println("Ingresa el primer número: ");
		a = entrada.nextInt();
		
		System.out.println("Ingresa el segundo número: ");
		b = entrada.nextInt();

		if (a==b) {System.out.println("El primero número es igual que el segundo");
		} else if (a>b) {System.out.println("El primer número es mayor que el segundo");
		} else {System.out.println("El segundo número es mayor que el primer numero");}
	}

}
