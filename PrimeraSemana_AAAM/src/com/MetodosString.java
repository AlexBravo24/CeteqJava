package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase string
		
		//declarar una cadena de texto que nos sirva como ejemplo
		
		String cadena = "Hoy es 18 de Octubre de 2023";
		
		
		//.length() - devuelve el valor del tamaño de nuestra cadena de texto en un valor numerico entero
		System.out.println(cadena + " contiene " + cadena.length() + " caracteres ");

		
		//.charAt() - Nos devuelve el caracter de acuerdo a la posicion en la que se encuenta dicho caracter
		System.out.println(cadena.charAt(2));
		
		
		//.substring - devolver una subcadena a partir del indice especificado
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 20));
		
		
		//.toLowerCase() convierte la cadena a minusculas
		//.toUpperCase() convierte la cadena a mayusculas
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		
		//.equals() - Compara el valor de un objeto contra otro
		//compara el valor de un string contra otro
		System.out.println(cadena.equals("hoy es 18 de octubre de 2023"));
		
		
		//.equalsIgnorreCase() - Compara el valor de un objeto contra otro pero ignora el uso de mayus y minus
		System.out.println(cadena.equalsIgnoreCase("HoY es 18 DE oCtuBre DE 2023"));
		
		
		//cadena.contentEquals
		System.out.println(cadena.contentEquals("2023"));
		
		
		//.replace - reemplazar las aparciones de un caracter con otro que indiquemos
		System.out.println(cadena.replace(" ", "_"));
		
	}

}
