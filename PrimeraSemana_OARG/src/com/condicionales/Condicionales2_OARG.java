package com.condicionales;

import java.util.Scanner;

public class Condicionales2_OARG {

	public static void main(String[] args) {
	// Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner entrada= new Scanner(System.in);
		 int a;
		 
		 System.out.println("Ingresa un numero: ");
		 a= entrada.nextInt();
		 
		 int numero1 = a%2;
		 
		 if (numero1==0) {
			 System.out.println("el numero es par");
		 }else {System.out.println("el numero es impar");
		
		 }
		 
	}//fin del main

}//fin de la clase
