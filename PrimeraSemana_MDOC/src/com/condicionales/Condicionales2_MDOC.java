package com.condicionales;

import java.util.Scanner;

public class Condicionales2_MDOC {

	public static void main(String[] args) {
		
		
		System.out.println("�Hola! �ste programa te dir� si el n�mero es Par o Impar");
		
		System.out.println("Por favor, introduce el valor: ");
		Scanner numero1 = new Scanner(System.in);
		int valor1 = numero1.nextInt();
		
		byte n = 2;
		
		int residuo = valor1%n; 
		
		if (residuo>0) {
			
			System.out.println("El " + valor1 + " es un n�mero Impar");
			
		}
		
		else if (residuo==0) {
			
			System.out.println("El " + valor1 + " es un n�mero Par");
			
		}
		
				

	}

}
