package com.ciclos;

public class Ciclos3_ADCA {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo. 
		String palabra = "anitalavalatina";
		String reversa ="";
		
		for(int i = palabra.length() -1; i >= 0; i--) {
			reversa += palabra.charAt(i);
			
		}
		
		boolean palindromo = true;
		for(int i = 0; i < palabra.length();i++) {
			if(palabra.charAt(i) != reversa.charAt(i)) {
				palindromo = false;
			}
		}
		if(palindromo) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}

	}

}
