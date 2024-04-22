package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AAAM {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par o impar
		Scanner entrada = new Scanner(System.in);
		int num;
		int residuo;
		System.out.println("Introduce un numero"); 
		num = entrada.nextInt();
		residuo = num%2;
		if (residuo == 0) {
			System.out.println("El numero " + num + " es par");
		}else 
			System.out.println("El numero " + num + " es inpar");
		
	}

}
