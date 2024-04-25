package com.condicionales;

import java.util.Scanner;

public class NumeroParOImpar {

	public static void main(String[] args) {
		System.out.println("Numero par o impar");
		Scanner entrada =  new Scanner(System.in); 

		System.out.println("Ingresa un numero numero");
		int n1 = entrada.nextInt();
		int divisor = 2;
		int resultado = n1%divisor;
		if (resultado==0) {
			System.out.println("El numero " + n1 + " es par");
		}
		else{
			System.out.println("El numero " + n1 + " es impar");
		}
		
	}

}
