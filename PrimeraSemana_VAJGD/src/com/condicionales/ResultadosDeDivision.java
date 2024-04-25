package com.condicionales;

import java.util.Scanner;

public class ResultadosDeDivision {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos números y muestre el resultado
		// de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		System.out.println("Resultado de una division");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero: ");
		int n1 = entrada.nextInt();
		System.out.println("Ingresa el segundo numero");
		int n2 = entrada.nextInt();
		int resultado = (n1/n2);
		if(n2==0){
			System.out.println("Error de operacion");
		}
		else {
			System.out.println("El resultado de la division es: "+ resultado);
		}
	
	
	}

}
