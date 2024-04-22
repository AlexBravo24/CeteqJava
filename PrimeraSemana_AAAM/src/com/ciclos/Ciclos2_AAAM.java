package com.ciclos;

import java.util.Scanner;

public class Ciclos2_AAAM {

	public static void main(String[] args) {
//		Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

		int x;
		int y;
		int a;
		int b = 1;
		int res = 1;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero a multiplicar:");
		x = entrada.nextInt();
		System.out.println("Introduce el numero final por el que será multiplicado:");
		y = entrada.nextInt();
		a = x*y;
		System.out.println("La tabla de multiplicar de " + x + " hasta " + y + " es:" );
		while (res < a) {
			res = x*b;
			System.out.println(x + " X " + b + " = " + res);
			b++;
		}
		
	}

}
