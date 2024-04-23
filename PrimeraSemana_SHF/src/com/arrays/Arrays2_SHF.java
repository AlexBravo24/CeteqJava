package com.arrays;

public class Arrays2_SHF {

	public static void main(String[] args) {
		
//		2. Crea un array de números de 100 posiciones, que contendrá los números del 
//		1 al 100. Obtén la suma de todos ellos y la media. 

		int[] numeros = new int[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 1;
		}
		
		int suma = 0;
		for(int numero : numeros) {
			suma += numero;
		}
		
		double media = (double) suma / numeros.length;
		
		System.out.println("La numa de todos los números es: " + suma);
		System.out.println("La media de los números es: " + media);
	}

}
