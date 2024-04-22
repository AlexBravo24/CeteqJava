package com.condicionales;

import java.util.Scanner;

public class Condicionales2_EDB{

	public static void main(String[] args) {
		
		//2.Realiza un programa que pida un número por teclado y nos indique 
		//si es par o impar. 
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Ingresa un número: ");
		numero = entrada.nextInt();
		
		if (numero%2 == 0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}

	}

}
