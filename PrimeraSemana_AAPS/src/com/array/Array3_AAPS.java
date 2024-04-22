package com.array;

import java.util.Scanner;

public class Array3_AAPS {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.

		Scanner cadena = new Scanner (System.in);
		
		System.out.println("Ingresa una frase para transformar esta a un array de caracteres: ");
		
		String frase = cadena.nextLine();
		
		char [] caracteres = new char [frase.length()];
		
		for (int i = 0; i < frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
			System.out.println(caracteres [i]);
		}
		
	}

}
