package com.condicionales;

import java.util.Scanner;

public class Condicionales7_AAAM {

	public static void main(String[] args) {
// 		El director de una escuela est� organizando un viaje de estudios y requiere 
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
//		alumno por el viaje.

		int x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el numero de alumnos que iran al viaje:");
		x = entrada.nextInt();
		if (x >= 100) {
			System.out.println("Se deber� pagar a la compa�ia de viajes " + (x*65) + " euros y cada alumno pagar� 65 euros"); 
		}else if (x>49 && x<100) {
			System.out.println("Se deber� pagar a la compa�ia de viajes " + (x*70) + " euros y cada alumno pagar� 70 euros");
		}else if (x>29 && x<50) {
			System.out.println("Se deber� pagar a la compa�ia de viajes " + (x*95) + " euros y cada alumno pagar� 95 euros");
		}else if (x<30) {
			System.out.println("Se deber� pagar a la compa�ia de viajes 4000 euros y cada alumno pagar� " + (4000/x) + " euros");
		} 
		
		
	}

}
