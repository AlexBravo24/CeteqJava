package com.arrays;

public class Array2_OARG {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		// 1 al 100. Obt�n la suma de todos ellos y la media.
		
		System.out.println("Array de 10 posiciones que contiene los numeros del 1 al 100");
		System.out.println("Obteniendo la suma de todos ellos y la media");
        
		
		int [] numeros= new int [100];
		double suma=0;
		double media;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=i+1;
			suma=suma+numeros[i];
			
		}
		
		System.out.println("La suma es de: "+suma);
		
		media=suma/numeros.length;
		
		System.out.println("La media es: "+media);

	}

}
