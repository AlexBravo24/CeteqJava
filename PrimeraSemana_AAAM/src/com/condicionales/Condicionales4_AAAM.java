package com.condicionales;

import java.util.Scanner;

public class Condicionales4_AAAM {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas

		Scanner entrada = new Scanner(System.in);
		String cadena1;
		String cadena2;
		System.out.println("Introduce un texto"); 
		cadena1 = entrada.nextLine();
		cadena2 = cadena1.toLowerCase();
//		System.out.println(cadena1);
//		System.out.println(cadena2);
		if (cadena1.contentEquals(cadena2)) {
			System.out.println("El texto " + cadena1 + " no contiene mayusculas");
		} else
			System.out.println("El texto " + cadena1 + " contiene mayusculas");
		
	}

}
