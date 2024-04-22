package com.ciclos;

import java.util.Scanner;

public class Ciclos3_AAPS {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		// Palindromo: Palabra o frase cuyas letras están dispuestas de tal manera
		// que resulta la misma leída de izquierda a derecha que de derecha a izquierda
		
		 Scanner entrada = new Scanner (System.in);
		 
		  System.out.println("Introduce una palabra: ");
		    
		  String cadena_texto = entrada.nextLine().toLowerCase();
		  String reverso = "";
		        
		        for (int i = cadena_texto.length() - 1; i >=0; --i) {
		              reverso = reverso + cadena_texto.charAt(i);
		          }
		    
		        if (cadena_texto.equals(reverso)) {
		          System.out.println(cadena_texto + " es palindromo");
		        }
		        else {
		          System.out.println(cadena_texto + " no es palindromo");
		          }	
	}
}
