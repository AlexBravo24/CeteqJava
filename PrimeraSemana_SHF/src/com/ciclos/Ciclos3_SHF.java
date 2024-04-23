package com.ciclos;

import java.util.Scanner;

public class Ciclos3_SHF {

	public static void main(String[] args) {

		 Scanner entrada = new Scanner(System.in);

		 System.out.println("Ingrese una palabra: ");
		 String palabra = entrada.nextLine();
		 
		 palabra = palabra.toLowerCase();
		 int longitud = palabra.length();
		 
		 boolean esPalindromo = true;
		 
		 for(int i = 0; i < longitud/2; i++) {
			 int indicefinal = longitud-1-i;
			 
			 if(palabra.charAt(i) != palabra.charAt(indicefinal)) {
				 esPalindromo = false;
				 break;
			 }
		 }
		 if (esPalindromo) {
			 System.out.println("La palabra es un palíndromo");
		 } else {
			System.out.println("La palabra no es un palindromo"); 
		 }
		 
    }
}
