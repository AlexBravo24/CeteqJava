package com.arrays;

import java.util.Scanner;

public class Arrays1_SHF {

	public static void main(String[] args) {
		
//		1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. 
//		Muestra por consola el �ndice y el valor al que corresponde. 

		Scanner input = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("ingresa un n�mero en la posici�n: " + i);
			numeros[i] = input.nextInt();
		}
		input.close();
		
		System.out.println("Posici�n - N�mero asignado");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("   " + i + "      -      " + numeros[i]);
		}
	}

}
