package com.condicionales;

import java.util.Scanner;

public class Condicionales4_MDOC {

	public static void main(String[] args) {
		
		System.out.println("�ste programa identifica si hay letras may�sculas en una oraci�n");
		System.out.println("Por favor, ingresa tu oraci�n: ");
		
		String ora; 
		
		Scanner frase = new Scanner(System.in);
		ora =frase.nextLine();
		String ora2= ora.toLowerCase();
//		String ora2 = ora.toString().toLowerCase();
		
		if (ora2 != ora) {
			System.out.println("La frase contiene may�sculas");			
		} else {
			System.out.println("La frase No contiene may�sculas");
		}
		

	}

}
