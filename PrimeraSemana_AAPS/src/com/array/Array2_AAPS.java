package com.array;

public class Array2_AAPS {
	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100. 
		// Obt�n la suma de todos ellos y la media.

		
		int [] numeros = new int [100];
		
		int suma = 0;
		double media;
		
		for (int i = 0 ; i < numeros.length; i++) {
			numeros[i]=i+1;
			suma+=numeros[i];
		}
		
		media= (double) suma/numeros.length;
		
		System.out.println("La suma todos los numeros del 1 al 100 es " + suma);
		System.out.println("Mientras que la media es " + media);
		
	}
}
