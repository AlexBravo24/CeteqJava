package com.arrays;

import java.util.Scanner;

public class Arrays1_SHF {

	public static void main(String[] args) {
		
//		1. Crea un array de 10 posiciones de números con valores pedidos por teclado. 
//		Muestra por consola el índice y el valor al que corresponde. 

		Scanner input = new Scanner(System.in);
		
		int [] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("ingresa un número en la posición: " + i);
			numeros[i] = input.nextInt();
		}
		input.close();
		
		System.out.println("Posición - Número asignado");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("   " + i + "      -      " + numeros[i]);
		}
	}

}
