package com.ciclos;

import java.util.Scanner;

public class Ciclos3_AAAM {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		//Necesitamos una variable de tipo string donde recibir esa info por teclado
		
		String original;
		String reversa = "";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa la palabra o frase que deseas verificar:");
		original = entrada.nextLine();
		entrada.close();
		
		//vamos a iterar al revés para armar nuestro String original en reversa para compararlos
		for (int i = original.length()-1; i>=0; i--) {
			reversa = reversa + original.charAt(i);
						
		}
		
		//Revisamos con una ipresion como quedan nuestras variables hasta el momento
		if(original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
	}

}
	