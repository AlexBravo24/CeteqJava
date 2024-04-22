package com;

public class MetodosString {

	public static void main(String[] args) {
		
		
		//DECLARAR UNA CADENA DE TEXTO
	
		String cadena  = "Hoy es 16 de Abril del 2024";
		
		//.length()- devuelve el valor del tama�o de la cadena en un valor num�rico entero
		
		System.out.println("Probando el m�todo length");
		System.out.println(cadena.length());
		
		
		//.charAt()- Nos devuelve  el caracter de acuerdo a la posici�n en la que se encuentre 
		
		System.out.println("Probando el m�todo chartAt");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//substring devuelve una subcadena a partir del indice especificado
		
		System.out.println("Probando el m�todo substring()");
		System.out.println(cadena.substring(4));
		
		//.toLowerCase() convierte la cadena a minusculas / mayusculas toUpperCase()
		
		
		System.out.println("Probando el m�todo toLowerCase()");
		System.out.println(cadena.toLowerCase());//minusculas
		
		System.out.println("Probando el m�todo toUpperCase()");
		System.out.println(cadena.toUpperCase()); //mayusculas 
		
		
		//equals() compara el valor de un objeto contra otro
		
		
		System.out.println("Probando el m�todo equals()");
		System.out.println(cadena.equals("hoy es 16 de abril del 2024"));
		
		
		//equalsIgnoreCase() ignora el uso de may�scula 
		
		System.out.println("Probando el m�todo equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy es 16 de aBril Del 2024"));
		
		//Colecciones de datos 
		
		System.out.println(cadena.contentEquals("Hoy es 16 de abril del 2024"));
		
		//.replace() nos permite reemplazar las apariciones de un caracter con otro 
		
		System.out.println("Probando el m�todo replace()");
		System.out.println(cadena.replace("o", "$"));
	

	}

}
