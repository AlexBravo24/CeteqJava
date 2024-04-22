package com.condicionales;

import java.util.Scanner;

public class Condiciones3_AAPS {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y 
		// muestre el resultado de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner (System.in);
		
		int a; 
		
		int b;
		
		System.out.println("Ingresa un número que será el dividendo: ");
		a = entrada.nextInt();
		
		System.out.println("Ingresa un número que será el divisor: ");
		b = entrada.nextInt();
		
		if (b==0) {System.out.println("Error");
		} else {
			
			int cociente = a/b;
			
			int residuo = a%b;
			
			System.out.println("El cociente de la divisón es " + cociente + " con un residuo de " + residuo );}
			
	}

}
