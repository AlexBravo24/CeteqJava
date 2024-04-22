package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AAAM {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error
		double num1;
		double num2;
		double resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("selecciona el divisor");
		num1 = entrada.nextInt();
		System.out.println("selecciona el dividendo");
		num2 = entrada.nextInt();
		resultado = num1/num2;
		if (num2 == 0) {
			System.out.println("Error: ningun numero pede ser dividdo entre 0, por favor seleccione otro numero.");
		}else 
			System.out.println("El resultado de la division es " + resultado);
	}

}
