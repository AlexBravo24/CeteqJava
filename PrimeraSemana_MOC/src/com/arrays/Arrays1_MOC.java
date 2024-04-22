package com.arrays;

import java.util.Scanner;

public class Arrays1_MOC {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado. 
		//Muestra por consola el índice y el valor al que corresponde.
		Scanner input=new Scanner (System.in);
		int[] valores= new int[10];
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Ingresa el valor que deseas en la posición "+i);
			valores[i]=input.nextInt();
		}
		input.close(); 
		for (int i = 0; i < valores.length; i++) {
			System.out.println("El valor en la posicion "+(i+1)+" es igual a: "+valores[i]);
		}
	}

}
