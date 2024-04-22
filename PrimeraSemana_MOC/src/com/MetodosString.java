package com;

public class MetodosString {

	public static void main(String[] args) {
		//Metodos o funcionalidades de la clase String
		
		//Declarar una cadena de texto como ejemplo
		
		String cadena="Hoy es 18 de Octubre de 2023";
		
		//.length() Devuelve el valor del tamaño de la cadena de texto
		//en un valor numerico entero
		System.out.println("Pueba de metodo .length");
		System.out.println(cadena.length());
		
		//.charAL() Nos devuelve el caracter de acuerdo a la posicion 
		//que se encuentre dicho caracter
		System.out.println("Probando el metodo .charAL");
		System.out.println(cadena.charAt(27));
		
		//.substring devuelve una subcadena a partir del indice especificado
		System.out.println("Probando el metodo .substring");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 20));

		//metodo .toLowerCase()./ toUpperCase
		//Convierte la cadena a minuscula/Convierte la cadena a mayuscula
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println("Probando el metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		
		//.equals() Compara el valor de un objeto contra otro
		System.out.println("Probando el metodo .equals");
		System.out.println(cadena.equals("hoy es 18 de octubre de 2023"));
		
		//.equalsIgnoreCase() Compara el valor de un objeto contra otro
		//ignorando si hay mayusculas o minusculas
		System.out.println("Probando el metodo .equalsIgnoreCase");
		System.out.println(cadena.equalsIgnoreCase("hoy es 18 de octubre de 2023"));
		
		//.contentEquals funciona casi igual que equals
		System.out.println(cadena.contentEquals("2023"));
		
		//.replace
		//permite reemplazar las aparaiciones de un texto o caracter
		//a otro que indiquemos
		System.out.println("probando el metodo .replace");
		System.out.println(cadena.replace("o", "$"));
	}

}
