package com.condicionales;

import java.util.Scanner;

public class Condionales1_OARG {

	public static void main(String[] args) {
	// 1.Realiza un programa que reciba dos números por teclado e indique cuál es
	//mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer numero: ");
		a=entrada.nextInt();
		
		System.out.println("Ingresa el segundo numero: ");
		b=entrada.nextInt();
		
		if (a==b) {
			System.out.println("LOS NUMEROS SON IGUALES");
		}else if (a>b) {
			System.out.println("EL PRIMER NUMERO ES MAYOR");
		}else {
			System.out.println("EL SEGUNDO NUMERO ES MAYOR");
		}
		
	}//Fin del main

}//Fin de la clase
