package com.condicionales;

import java.io.IOException;
import java.util.Scanner;

public class Condicionales4_TMPE {

	public static void main(String[] args) throws IOException {
		// 4. Realiza un programa que lea una cadena por teclado 
		//y compruebe si contiene letras mayúsculas.

		char car;
		System.out.print("Introduzca una cadena: ");
		car = (char) System.in.read();
		
		if (Character.isUpperCase(car))
		{
			System.out.println("Contiene letras mayúsculas");
			
		} else {
			System.out.println("No contiene letras mayúsculas");
		}
		

	}

}
