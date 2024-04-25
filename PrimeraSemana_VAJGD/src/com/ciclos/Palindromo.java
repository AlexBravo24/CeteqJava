package com.ciclos;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
//// Realiza un programa para determinar si un String es palindromo
		
		//Necesitamos una variable de tipo String donde recibir
		//esa info por teclado
		String original;
		String reversa = "";
		
		//Declaro un Scanner para ingresar los valores por teclado
		
		Scanner entrada = new Scanner(System.in);
		//Solicito que se ingrese la info
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();
		//Puedo cerrar mi scanner si ya lo utilizo más
		entrada.close();
		
		//Vamos a iterar al revés para armar nuestro String original
		//en reversa y compararlos //Ana 2
		for (int i = original.length()-1; i>=0; i--) {
			reversa = reversa + original.charAt(i); //a + n + A
		}
		//Revisamos con una impresion en consola como quedaron nuestras variables hasta el
		//momento
		System.out.println(original);
		System.out.println(reversa);
		
		//Ahora solo falta compararlos con .equals
		if(original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
//			
		}
	
	
	
	}


