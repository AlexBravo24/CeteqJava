package com.condicionales;

import java.util.Scanner;

public class Condicionales2_MOC {

	public static void main(String[] args) {
		
		//Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar.
		Scanner entrada= new Scanner(System.in);
		int n;
		
		System.out.println("Ingresa el n�mero a evaluar");
		n=entrada.nextInt();
		int resultado=n%2;
		
		if (resultado==0) {
			System.out.println("El n�mero evaluado es par");
		}
		else {
			System.out.println("El n�mero evaluado es impar");
		}
		
	}

}
