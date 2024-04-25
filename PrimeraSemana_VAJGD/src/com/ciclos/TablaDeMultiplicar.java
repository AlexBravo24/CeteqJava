package com.ciclos;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
//		Programa un algoritmo que realice la tabla de multiplicar de un numero
//		introducido desde teclado, hasta la iteración deseada por el usuario.
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = 
		System.out.println("Tabla de multiplicar");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el numero a multiplicar: ");
		int n1 = entrada.nextInt();
		System.out.println("Ingresa hasta que numero se multiplicara: ");
		int n = entrada.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println(n1+" x "+ i +" = "+(n1*i));	
		}
	}

}
