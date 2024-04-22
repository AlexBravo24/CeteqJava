package com;

public class MetodosString {

	public static void main(String[] args) {
		// M�todos o funcionalidades de la clase String
		
		//Declarar una cadena de texto
		//Que nos sirva como ejemplo
		
		String cadena="Hoy es 16 de Abril de 2024";
		
		//.length () - devuelve el valor del tama�o de nuestra
		//cadena de texto en un valor n�merico entero
		System.out.println("Probando el metodo .length()");
		System.out.println(cadena.length());
		
		//.charAt() - Nos devuelve el caracater de acuerdo a la posicion en la que
		//se encuentre dicho caracter
		
		System.out.println("Probando el m�todo.charAt()");
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.substring - devuelve una subcadena a partir del 
		//indicie especificado
		
		System.out.println("Probando el m�todo .substring()");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		//.toLowetCase()/.toUpperCases() -
		//convierte la cadena a minusculas/ Convierte la cadena a may�sculas
		
		System.out.println("Probando el m�todo. toLowerCase()");
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.equals() - Compara el valor de un objeto contra otro
		//Compara el valor de un String contra otro
		
		System.out.println("Probando el metodo .equals()");
		System.out.println(cadena.equals("Hoy es 16 de Abril de 2024"));
		
		//.equalsIgnoreCase() - Compara el valor de un String contra otro
		//e ignora el uso de may�sculas y min�sculas
				
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("Hoy ES 16 de AbRil dE 2023"));
		
		//.replace() - Nos permite remplazar las apariciones de un texto o caracater
		//con otro que indiquemos
		
		System.out.println("Probando el m�todo .replace()");
		System.out.println(cadena.replace("e", "$"));
		

	}

}
