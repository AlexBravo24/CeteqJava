package com.condicionales;

import java.util.Scanner;

public class Condional7_OARG {

	public static void main(String[] args) {
//		El director de una escuela est� organizando un viaje de estudios y requiere
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada
//		alumno por el viaje.

		Scanner cadena = new Scanner (System.in);
		int alumnos;
		double autobus=4000;
		System.out.println("Este programa calcula el pago a realizar de los alumnos y a la compa�ia de autobuses");
		
		System.out.println("Ingresa la cantidad de alumnos que asisitiran al viaje: ");
		alumnos=cadena.nextInt();
		
		double pago=autobus/alumnos;
		
		if (alumnos>=100) {
			System.out.println("El costo por alumno es de: 65 Euros");
			System.out.println("La renta a pagara por el autobus es de: 4000 Euros");
		}else if (alumnos>=50 && alumnos<=99){
			System.out.println("El costo por alumno es de: 70 Euros");
			System.out.println("La renta a pagara por el autobus es de: 4000 Euros");
			
		}else if (alumnos>=30 && alumnos<=49) {
			System.out.println("El costo por alumno es de: 95 Euros");
			System.out.println("La renta a pagara por el autobus es de: 4000 Euros");
		}else if (alumnos<30 && alumnos>=1) {
			
			System.out.println("El costo por alumno es de: "+ pago + " Euros");
			System.out.println("La renta a pagara por el autobus es de: 4000 Euros");
		}else if (alumnos<=0) {
			System.out.println("SE CANCELA EL VIAJE");
		}
		
		
	}

}
