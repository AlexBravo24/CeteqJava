package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MOC {
	
public static void main(String[] args) {
	
	// Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.
	Scanner entrada= new Scanner(System.in);
	int a;
	int b;
	
	System.out.println("Ingresa el primer número");
	a=entrada.nextInt();
	System.out.println("Ingresa el segundo número");
	b=entrada.nextInt();
	
	if(a<b) {
		System.out.println("El primer número menor que el segundo");
	}
	else if (a==b) {
		System.out.println("Los números son iguales");
	}
	else {
		System.out.println("El primer número es mayor que el segundo");
	}
}

}
