package com.condicionales;

import java.util.Scanner;

public class Condiconales4_SHF {

	public static void main(String[] args) {
		
		//4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas. 
		
		 Scanner entrada = new Scanner(System.in);

	        System.out.println("Ingrese una cadena:");
	        String cadena = entrada.nextLine();

	        boolean contieneMayusculas = false;

	        for (int i = 0; i < cadena.length(); i++) {
	            char caracter = cadena.charAt(i);
	            if (Character.isUpperCase(caracter)) {
	                contieneMayusculas = true;
	                break; 
	            }
	        }

	        if (contieneMayusculas) {
	            System.out.println("La cadena contiene al menos una letra mayúscula.");
	        } else {
	            System.out.println("La cadena no contiene letras mayúsculas.");
	        }
	}

}
