package com.condicionales;

import java.util.Scanner;

public class Condicionales3_EDB {

	public static void main(String[] args) {
		
		//3.Crea un programa que pida al usuario dos n�meros y muestre el resultado 
		//de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner(System.in);
		
		float a;
		float b;
		
		System.out.println("Ingresa el primer n�mero: ");
		a = entrada.nextFloat();
		
		System.out.println("Ingresa el segundo n�mero:" );
		b = entrada.nextFloat();
				
		if (b == 0) {
			System.out.println("Error");
		}else {
			System.out.println("La divisi�n es: " + (a/b));
		}

	}

}
