package com.ciclos;

import java.util.Scanner;

public class Ciclo3_OARG {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.

		//Clase Scanner para entrada datos
		Scanner cadena= new Scanner (System.in);
		
		//Declarar variables
		String palabra;
		char[]palindromo;
		int izquierdo,derecho;
		
		
		System.out.println("Ingresa la palabra o frase: ");
		palabra=cadena.nextLine();//Guarda informacion en la variable
		palabra=palabra.toLowerCase();//Convierte la cadena en minusculas
		palabra= palabra.replace(" ", "");//Cambia un caracter por un caracter deseado
		palindromo=palabra.toCharArray(); //Asigna los caracteres de una variable
		izquierdo=0; //Asigna la posicion del primer caracter
		derecho=palindromo.length-1;//Asigna la posicion del ultimo caracter
		
		while (izquierdo<derecho) { 
			if ( (palindromo [izquierdo]) == (palindromo[derecho])){
				
				derecho--; 
				izquierdo++;
			}else {
				System.out.println("La palabra no es un palindormo");
				break;
			}
		}
		
		if (izquierdo==derecho) {
			System.out.println("La palabra es un palindromo");
			
		}
	}
}


