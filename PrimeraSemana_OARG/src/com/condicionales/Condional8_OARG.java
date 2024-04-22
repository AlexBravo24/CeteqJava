package com.condicionales;

import java.util.Scanner;

public class Condional8_OARG {

	public static void main(String[] args) {
//		Realiza un programa que pida por teclado el resultado (dato entero)
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
//		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
//		mostrará el mensaje: “ERROR: número incorrecto”.
		
		Scanner cadena = new Scanner (System.in);
		System.out.println("Este programa indica cual es la cara opuesta al ingresar el numero de la cara que dio al lanzar un dado de 6 caras");
		
		
		int numero;
		System.out.println("Ingresa el numero que aparece en la cara superior al lanzar el dado: ");
		numero=cadena.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("La cara opuesta es: SIES");
			break;
			
		case 2:
			System.out.println("La cara opuesta es: CINCO");
			break;
			
		case 3:
			System.out.println("La cara opuesta es: CUATRO");
			break;
			
		case 4:
			System.out.println("La cara opuesta es: TRES");
			break;
			
		case 5:
			System.out.println("La cara opuesta es: DOS");
			break;
			
		case 6:
			System.out.println("La cara opuesta es: UNO");
			break;
			
		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}

	}

}
