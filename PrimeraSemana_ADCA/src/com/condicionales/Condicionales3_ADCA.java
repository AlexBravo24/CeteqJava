package com.condicionales;

import java.util.Scanner;

public class Condicionales3_ADCA {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		int a;
		int b;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introdusca el primer numero");
		
		a = entrada.nextInt();
		
		System.out.println("Introdusca el segundo numero");
		
		b = entrada.nextInt();
		
		if(b == 0) {
			System.out.println("Error, el segundo numero no puede ser 0");
		}else{
			System.out.println("La division es igual a " + (a/b));
		}
		

	}

}
