package com.condicionales;

import java.util.Scanner;

public class Condicionales2_ADCA {
	
	//Realiza un programa que pida un número por teclado y nos indique si es par 
	//o impar.
	
	public static void main(String[] args) {
		int a;
		int b = 2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un numero");
		a = entrada.nextInt();
		if(a % b == 0) {
			System.out.println("el numero SI es par");
		}else {
			System.out.println("el numero NO es par");
		}
		
	}

}
