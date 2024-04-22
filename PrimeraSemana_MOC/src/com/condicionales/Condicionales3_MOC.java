package com.condicionales;

import java.util.Scanner;

public class Condicionales3_MOC {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado de su división. 
		// Si el segundo número es 0, debe mostrar un mensaje de error.

		Scanner entrada=new Scanner(System.in);
		int n1;
		System.out.println("Ingresa el valor del dividendo");
		n1=entrada.nextInt();
		int n2;
		System.out.println("Ingresa el valor del divisor");
		n2=entrada.nextInt();
		
		if(n2==0) {
			System.out.println("La operación no puede ser realizada");
		}
		else {
			System.out.println("El resultado de la división es: " + (n1/n2));
		}
	}

}
