package com.condicionales;

import java.util.Scanner;

public class Condicionales1_ADCA {
	
	public static void main(String[] args) {
		int a; //este seria el primer valor
		int b; //este seria el segundo valor
		
		Scanner entrada = new Scanner(System.in); 
		System.out.println("Ingrese el primer valor");
		a = entrada.nextInt();
		System.out.println("Ingrese el segundo valor");
		b = entrada.nextInt();
		
		if(a == b) {
			System.out.println("Los numeros son iguales");
		}else if(a < b ) {
			System.out.println(a + " es menor que " + b);
		}else {
			System.out.println(a + " es mayor que " + b);
		}
		
	}

}
