package com.condicionales;

import java.util.Scanner;

public class Condicionales4_ADCA {

	public static void main(String[] args) {
		//  Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas. 
		char[] mayus = {'A', 'B', 'C', 'D', 'E','F','G','H','I','J','K','L','M','N','O',
				'P','Q','R','S','T','U','V','W','X','Y','Z'};
		String palabra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("escriba una palabra");
		palabra = entrada.nextLine();
		if(Character.isUpperCase('E')){
			System.out.println("La palabra contiene una mayuscula");
		}else {
			System.out.println("la palabra No contiene una mayuscula");
		}
		

	}

}
