package com.arrays;

public class Arrays2_SHF {

	public static void main(String[] args) {
		
//		2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//		1 al 100. Obt�n la suma de todos ellos y la media. 

		int[] numeros = new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}
		
		int suma = 0;
		for(int numero : numeros) {
			suma += numero;
		}
		
		double media = (double) suma / numeros.length;
		
		System.out.println("La numa de todos los n�meros es: " + suma);
		System.out.println("La media de los n�meros es: " + media);
	}

}
