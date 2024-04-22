package com.arrays;

import java.util.Scanner;

public class Arrays3_MOC {

	public static void main(String[] args) {
		// Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingresa la frase");
		String frase=entrada.nextLine();
		int tamaño=frase.length();
		entrada.close(); 
		char [] caracteres=new char[tamaño];
	for (int i = 0; i < caracteres.length; i++) {
		caracteres[i]=frase.charAt(i);
	}
		for(char i:caracteres) {
			System.out.println(i);
		}
	}

}
