package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// M�TODOS O FUNCIONALIDAS DE LA CLASE STRING
		//Para ello se declarar� una cadena de texto que sirva como ejemplo
		
		String cadena = "Hoy es 18 de Octubre de 2023";
		
		//.length()  devuelve el valor del tama�o de nuestra cadena de texto en un valor numerico entero
		System.out.println("Probando el m�todo .length(): ");
		System.out.println(cadena.length());
		
		// .chartAt() devuelve el caracter de acuerdo a la posici�n en que se encuentre dicho caracter
		System.out.println("Probando el m�todo .chartAt(): ");
		System.out.println(cadena.charAt(27));
		
		// .substring()  devuelve una subcadena a partir del indicie especificado
		System.out.println("Probando el m�todo .substring(): ");
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20)); //aqui le estoy indicando que intervalo de la cadena de texto quiero que me muestre
		
		//.toLowerCase() transforma todas las letras a minisculas / .toUpperCase() transforma todas las letras a mayusculas
		System.out.println("Probando el m�todo .toLowerCase(): ");
		System.out.println(cadena.toLowerCase());
		
		System.out.println("Probando el m�todo .toUpperCase(): ");
		System.out.println(cadena.toUpperCase());
		
		// .equals() compara el valor de un String contra otro, no solo en contenido sino tambien en sintaxis, verfica que sean identicos
		System.out.println("Probando el m�todo .equals(): ");
		System.out.println(cadena.equals("hoy es 18 de octubre de 2023"));
		
		// .equalsIngoreCase() ignora el uso de mayusculas o minusculas, al comparar solo verifica que el contenido del texto en s� sea el mismo
		System.out.println("Probando el m�todo .equals(): ");
		System.out.println(cadena.equalsIgnoreCase("HoY es 18 de OcTuBrE de 2023"));
		
		// .contentEquals() funciona pr�cticamente igual que .equals()
		System.out.println("Probando .contentEquals(): ");
		System.out.println(cadena.contentEquals("2023"));
		
		// .replace() permite remplazar las apariciones de un caracter con otro que inidiquemos
		System.out.println("Probando .replace(): ");
		System.out.println(cadena.replace("e", "#"));
		
	}
}
