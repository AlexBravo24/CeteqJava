package com.arrays;

import java.util.Scanner;

public class Arrays3_ADCA {
	public static void main(String[] args) {
		//Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres. 
		Scanner entrada = new Scanner(System.in);
		System.out.println("escriba una frase");
		String frase = entrada.nextLine();
		char[] caracteres = frase.toCharArray();
		for (char c : caracteres) {
            System.out.print(c + " ");
            }

	}

}
