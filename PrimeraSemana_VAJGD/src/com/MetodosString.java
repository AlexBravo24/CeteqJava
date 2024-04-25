package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos y funcionalidades de la clase String
		
		//Declarar una cadena de texto que nos sirva como ejemplo
		String cadena ="Hoy es 17 de Abril del 2024";
		System.out.println("Probando el metodo .lenght");
		System.out.println(cadena.length());
		//.lenght() - devuelve el valor del tamaño de nuestra cadena
		//de texto en valor numerico entero
		System.out.println("Probando el metodo .charAt");
		System.out.println(cadena.charAt(5));
		//.charAt() - Nos devuelve el caracter de acuerdo a la posicion en
		//que se encuentre dicho caracter
		System.out.println("Probando el metodo .substring()");
		System.out.println(cadena.substring(4,22));
		//Al utilizar esto podemos indicar donde debe comenzar el string y
		//al declarar el inicio y usar , podemos establecer hasta donde termina
		//por ejemplo .substring(4,20)
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(cadena.toLowerCase());
		//Al hacer esto nos convierte todas las letras a minusculas
		System.out.println("Probando el metodo .toUpperCase()");
		System.out.println(cadena.toUpperCase());
		//Al hacer esto convierte a todas nuestras letras a mayusculas
		System.out.println("Probando el metodo .equals()");
		System.out.println(cadena.equals("Hoy es 17 de Abril del 2024"));
		//Con este metodo podemos corroborar que lo que escribimos en el
		//string sea igual a los datos en una variable respetando mayusculas y minusculas
		//tambien nos funciona con objetos
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(cadena.equalsIgnoreCase("hoy es 17 de abril del 2024"));
		//Con este metodo podemos corroborar que lo que escribimos en el
		//string sea igual a los datos en una variable respetando sin importar mayusculas y minusculas
		System.out.println("Probando el metodo .contentEquals ()");
		System.out.println(cadena.contentEquals("Hoy es 17 de Abril del 2024"));
		//Este metodo funciona de la misma manera que equals es decir que verifica que el contenido sea el mismo
		//a nivel string
		System.out.println("Probando el metodo .replace()");
		System.out.println(cadena.replace(" ","$"));
		//Con este metodo podemos cambiar valores dentro de un string, solo debemos establecer el valor a cambiar
		// utilizar una coma y establecer el nuevo es decir ("A","O") y asi nos cambiaria la A por O
	
	
	
	
	
	}
	

}
