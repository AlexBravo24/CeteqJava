package com.arrays;

public class Arrays3_MDOC {

	public static void main(String[] args) {
		String cadena = "Programando en Java desde parzibyte.me";
		// Crear un StringBuilder a partir de la cadena
		StringBuilder stringBuilder = new StringBuilder(cadena);
		// Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
		String invertida = stringBuilder.reverse().toString();
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);
		
		// TODO Auto-generated method stub

	}

}
