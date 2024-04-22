package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AAAM {

	//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Introduce un numero"); 
		num1 = entrada.nextInt();
		System.out.println("Introduce un segundo numero"); 
		num2 = entrada.nextInt();
		
		if (num1 == num2) {
			System.out.println("Los numeros son iguales");
		}else if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}else if (num1 < num2) {
			System.out.println(num1 + " es menor que " + num2);
		}
	}

}
