package com.condicionales;

import java.util.Scanner;

public class Condiciones3_AAPS {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos n�meros y 
		// muestre el resultado de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		
		Scanner entrada = new Scanner (System.in);
		
		int a; 
		
		int b;
		
		System.out.println("Ingresa un n�mero que ser� el dividendo: ");
		a = entrada.nextInt();
		
		System.out.println("Ingresa un n�mero que ser� el divisor: ");
		b = entrada.nextInt();
		
		if (b==0) {System.out.println("Error");
		} else {
			
			int cociente = a/b;
			
			int residuo = a%b;
			
			System.out.println("El cociente de la divis�n es " + cociente + " con un residuo de " + residuo );}
			
	}

}
