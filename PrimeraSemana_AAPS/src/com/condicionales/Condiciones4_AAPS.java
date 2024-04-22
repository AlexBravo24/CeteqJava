package com.condicionales;

import java.util.Scanner;

public class Condiciones4_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
		
		String cadena;
		
		Scanner frase = new Scanner (System.in);
		cadena = frase.nextLine(); // aqui .nextLine porque quiero recoger más de un caracter
		
		String cadena2 = cadena.toLowerCase();
	
		if (cadena2 != cadena) {System.out.println("");}
		
	}

}
