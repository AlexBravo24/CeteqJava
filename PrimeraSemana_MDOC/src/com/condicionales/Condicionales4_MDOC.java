package com.condicionales;

import java.util.Scanner;

public class Condicionales4_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Éste programa identifica si hay letras mayúsculas en una oración");
		System.out.println("Por favor, ingresa tu oración: ");
		
		String ora; 
		
		Scanner frase = new Scanner(System.in);
		ora =frase.nextLine();
		String ora2= ora.toLowerCase();
//		String ora2 = ora.toString().toLowerCase();
		
		if (ora2 != ora) {
			System.out.println("La frase contiene mayúsculas");			
		} else {
			System.out.println("La frase No contiene mayúsculas");
		}
		

	}

}
