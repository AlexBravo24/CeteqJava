package com.arrays;

import java.util.Scanner;

public class Arrays3_SHF {

	public static void main(String[] args) {

//		3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//		caracteres.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una frase: ");
		String frase = entrada.nextLine();
		
		char[] caracteres = frase.toCharArray();
		
		System.out.println("La frase convertida a un arrray es: ");
		for(char caracter : caracteres) {
			System.out.println(caracter + " ");
		}
	}

}
