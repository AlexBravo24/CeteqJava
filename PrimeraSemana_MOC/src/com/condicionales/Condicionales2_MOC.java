package com.condicionales;

import java.util.Scanner;

public class Condicionales2_MOC {

	public static void main(String[] args) {
		
		//Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		Scanner entrada= new Scanner(System.in);
		int n;
		
		System.out.println("Ingresa el número a evaluar");
		n=entrada.nextInt();
		int resultado=n%2;
		
		if (resultado==0) {
			System.out.println("El número evaluado es par");
		}
		else {
			System.out.println("El número evaluado es impar");
		}
		
	}

}
