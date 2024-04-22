package com.arrays;

import java.util.Scanner;

public class Array1_OARG {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		// Muestra por consola el índice y el valor al que corresponde.
		
		Scanner cadena = new Scanner (System.in);
		
		double [] numeros = new double [10];
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Ingresa un numero en la posición: "+i);
			numeros[i]=cadena.nextDouble();
			
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("La posición "+ i +" contiene el numero: "+numeros[i] );
			
		}
		
		

	}

}
