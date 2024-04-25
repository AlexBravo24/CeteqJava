package com.condicionales;

import java.util.Scanner;

public class StringMayusculas {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas.
		System.out.println("Cadena de string en mayusculas");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un texto: ");
		String palabra = entrada.next();
		
		if(palabra==palabra.toUpperCase()){
			System.out.println("Esta frase tiene letras mayusculas");
		}
		else {
			System.out.println("Esta frase no esta en mayusculas");
		}
		
		
	}

}
