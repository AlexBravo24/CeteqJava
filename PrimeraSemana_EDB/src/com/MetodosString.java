package com;

import java.util.Scanner;

public class MetodosString {

	public static void main(String[] args) {
		
		// Métodos o funcionalidades de la clase String
		
		//Declarar una cadena de texto que nos sirva como ejemplo
		
		String cadena = "Hoy es 16 de Abril de 2024";
		
		//.length() - devuelve el valor del tamaño de nuestra
		//cadena de texto en un valor númerico entero
		System.out.println("Probando el método .length()");
		System.out.println(cadena.length());
		
		
		//.charAt () - Nos devuelve el caracter de acuerdo a la 
		//posicion en la que se encuentre dicho caracter
		System.out.println("Probando el método .charAt()");
		System.out.println(cadena.charAt(2));
		
		//.substring - devuelve una subcadena a partir del
		//inidice especificado
		System.out.println("Probando el método .substring()");
		System.out.println(cadena.substring(4,20));
		
		
		//.toLowerCase() / .toUpperCase() -
		// Convierte la cadena a minusculas/Convierte la cadena a mayusculas
		System.out.println("Probando el método .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el método .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		
		//.equals() - Compara el valor de un objeto contra otro
		//Comparar el valor de un String contra otro
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equals("Hoy es 16 de Abril de 2024"));

		
		//.equalsIgnoreCase() - Compara el valor de un objeto contra otro
		//e ignora el uso de mayusculas y minusculas
		System.out.println("Probando el método .equals()");
		System.out.println(cadena.equalsIgnoreCase("HoY eS 16 de AbRil dE 2024"));
		
		
		//.replace - Nos permite remplazar las apariciones de un texto o caracter
		//con otro que inidiquemos
		System.out.println("Probando el método .replace()");
		System.out.println(cadena.replace("e", "$"));
		
	
		
	}

}
