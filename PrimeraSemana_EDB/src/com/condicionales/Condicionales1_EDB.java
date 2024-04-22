package com.condicionales;

import java.util.Scanner;

public class Condicionales1_EDB {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b; 
		
		System.out.println("Ingresa el primer número");
		a = entrada.nextInt();
		
		System.out.println("Ingresa el segundo número");
		b = entrada.nextInt();
		
		if (a>b) {
			System.out.println("El primero es mayor que el segundo");
		}else if (a<b) {
			System.out.println("El segundo es mayor que el primero");
		}else {
			System.out.println("Los numeros son iguales");
		}
		
		
	

	}

}
