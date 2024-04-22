package com.arrays;

public class Arrays4_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Este programa invierte los valores de un arreglo original {1, 2, 3, 4, 5} ");
		
		int[] Original = {1, 2, 3, 4, 5};
		int[] Invertido = new int[Original.length];


		for (int i = 0; i < Original.length; i++) {
		Invertido[i] = Original[Original.length - 1 - i];
		}

	
		System.out.print("El Array invertido es: ");
		for (int valor : Invertido) {
		System.out.print(valor + " ");
		}
		
		
	}

}
