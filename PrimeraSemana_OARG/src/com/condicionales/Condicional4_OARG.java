package com.condicionales;

import java.util.Scanner;

public class Condicional4_OARG {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si
		//contiene letras mayúsculas.
		Scanner cadena= new Scanner(System.in);
		String palabra;
	
		
		
		
		System.out.println("Introduzca la cadena de texto: ");
		palabra=cadena.nextLine();
		
		if ((palabra==palabra.toLowerCase())){
			
			System.out.println("La cadena de texto no contiene mayusculas");
		}else {
			System.out.println("La cadena de texto si contiene mayusculas");
		}
		
		
		
	}

}
