package com.array;

import java.util.Scanner;

public class Array1_AAPS {
	public static void main(String[] args) {
		// Crea un array de 10 posiciones de n�meros con valores pedidos por teclado. 
		//Muestra por consola el �ndice y el valor al que corresponde.

		Scanner entrada = new Scanner (System.in);
		
		int [] posiciones = new int [10];
		
		for (int i = 0; i < posiciones.length; i++) {
			System.out.println("Ingresa un n�mero en la posici�n "+ i);
			posiciones[i] = entrada.nextInt();
		}
		entrada.close();
		for (int i = 0; i < posiciones.length; i++) {
			System.out.println(posiciones[i] + ", ");
			
		}
	
	}

}
