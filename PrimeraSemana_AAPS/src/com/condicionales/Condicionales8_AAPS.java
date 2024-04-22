package com.condicionales;

import java.util.Scanner;

public class Condicionales8_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
		// seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido. 
		// Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
		// Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: “ERROR: número incorrecto”.
		
		Scanner entrada = new Scanner (System.in);
		
		int dado;
		
		System.out.println("Ingresa el valor obtenido de lanzar un dado de seis caras para conocer el numero en la cara opuesta: ");
		
		dado = entrada.nextInt();
		
		switch (dado) {
		case 1:
			System.out.println("En la cara opuesta está el seis");
			break;
		case 2:
			System.out.println("En la cara opuesta está el cinco");
			break;
		case 3:
			System.out.println("En la cara opuesta está el cuatro");
			break;
		case 4:
			System.out.println("En la cara opuesta está el tres");
			break;
		case 5:
			System.out.println("En la cara opuesta está el dos");
			break;
		case 6:
			System.out.println("En la cara opuesta está el uno");
			break;
		default:
				System.out.println("Error. Valor incorrecto.");
		}

	}

}
