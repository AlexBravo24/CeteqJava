package com.arrays;

import java.util.Scanner;

public class Arrays1_ADCA {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde.
		Scanner entrada = new Scanner(System.in);
		
		int[] valores = new int[10];
		
		for(int i = 0; i < valores.length; i++) {
			System.out.println("ingrese el valor para la posicion " + i);
		valores[i] = entrada.nextInt();	}

	}

}
