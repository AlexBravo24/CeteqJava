package com.arrays;

import java.util.Scanner;

public class Array3_OARG {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.
		
		
		Scanner cadena = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Ingresa una frase: ");
		frase=cadena.nextLine();
		
		char caracter[]=frase.toCharArray();
		
		for (int i = 0; i < frase.length(); i++) {
			System.out.println("Los caracteres de tu frese son: "+caracter[i]);
		}

		
		
		
		

	}

}
