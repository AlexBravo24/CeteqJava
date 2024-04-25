package com.condicionales;

import java.util.Scanner;

public class DosNumeros {

	public static void main(String[] args) {
		//Clasificacion de dos numeros
	Scanner entrada = new Scanner(System.in);
	System.out.println("Clasificacion de 2 numeros");
	System.out.println("Ingresa el primer numero: ");
	int n1 = entrada.nextInt();
	System.out.println("Ingresa el segundo numero");
	int n2 = entrada.nextInt();
	if (n1>n2) {
		System.out.println("El numero 1 es mayor al numero 2");
		
	} 
	else if(n2==n1){
		System.out.println("Los numeros son iguales");

	}
	else {
		System.out.println("El numero 2 es mayor al numero 1");
	}
	
	}

}
