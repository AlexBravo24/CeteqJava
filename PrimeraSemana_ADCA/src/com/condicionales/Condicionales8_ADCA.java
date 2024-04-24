package com.condicionales;

import java.util.Scanner;

public class Condicionales8_ADCA {

	public static void main(String[] args) {
		/*Realiza un programa que pida por teclado el resultado (dato entero) 
		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
		mostrará el mensaje: “ERROR: número incorrecto”. */
		int lanzamiento;
		int cara = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el resultado del lanzamiento");
		lanzamiento = entrada.nextInt();
		if(lanzamiento == 1) {
			System.out.println("Seis");
		}else if(lanzamiento == 2){
			System.out.println("Cinco");
		}else if(lanzamiento == 3){
			System.out.println("Cuatro");
		}else if(lanzamiento == 4){
			System.out.println("Tres");
		}else if(lanzamiento == 5){
			System.out.println("Dos");
		}else if(lanzamiento == 6){
			System.out.println("Uno");
		}else {
			System.out.println("ERROR: número incorrecto");
		}
		

	}

}
