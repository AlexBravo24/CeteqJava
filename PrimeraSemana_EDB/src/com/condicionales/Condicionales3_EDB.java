package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EDB {

	public static void main(String[] args) {
		
		//3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		float a;
		float b;
		
		System.out.println("Ingresa el primer número: ");
		a = entrada.nextFloat();
		
		System.out.println("Ingresa el segundo número:" );
		b = entrada.nextFloat();
				
		if (b == 0) {
			System.out.println("Error");
		}else {
			System.out.println("La división es: " + (a/b));
		}

	}

}
