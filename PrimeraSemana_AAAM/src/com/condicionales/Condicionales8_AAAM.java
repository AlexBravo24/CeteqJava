package com.condicionales;

import java.util.Scanner;

public class Condicionales8_AAAM {

	public static void main(String[] args) {
//		Realiza un programa que pida por teclado el resultado (dato entero) 
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en 
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se 
//		mostrar� el mensaje: �ERROR: n�mero incorrecto�

		int x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escibe el n�mero de la cara superior del dado de 6 caras (1, 2, 3, 4, 5 � 6):");
		x = entrada.nextInt();
		
		if (x==1) {
			System.out.println("El numero de la cara opuesta es seis");
		}else if (x==2) {
			System.out.println("El numero de la cara opuesta es cinco");
		}else if (x==3) {
			System.out.println("El numero de la cara opuesta es cuatro");
		}else if (x==4) {
			System.out.println("El numero de la cara opuesta es tres");
		}else if (x==5) {
			System.out.println("El numero de la cara opuesta es dos");
		}else if (x==6) {
			System.out.println("El numero de la cara opuesta es uno");
		}else if (x<1 || x>6) {
			System.out.println("Error: n�mero incorrecto");
		}			
			
		
	}

}
