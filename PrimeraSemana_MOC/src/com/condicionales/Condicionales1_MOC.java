package com.condicionales;

import java.util.Scanner;

public class Condicionales1_MOC {
	
public static void main(String[] args) {
	
	// Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales.
	Scanner entrada= new Scanner(System.in);
	int a;
	int b;
	
	System.out.println("Ingresa el primer n�mero");
	a=entrada.nextInt();
	System.out.println("Ingresa el segundo n�mero");
	b=entrada.nextInt();
	
	if(a<b) {
		System.out.println("El primer n�mero menor que el segundo");
	}
	else if (a==b) {
		System.out.println("Los n�meros son iguales");
	}
	else {
		System.out.println("El primer n�mero es mayor que el segundo");
	}
}

}
