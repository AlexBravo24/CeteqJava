package com.condicionales;

import java.util.Scanner;

public class Condicionales7_TMPE {

	public static void main(String[] args) {
		// 7.El director de una escuela est� organizando un viaje de estudios y requiere
		//determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la
		//compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
		//100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99
		//alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
		//euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
		//euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita
		//determinar el pago a la compa��a de autobuses y lo que debe pagar cada
		//alumno por el viaje.

		Scanner lector = new Scanner(System.in);
	    int numeroAlumnos;
	
	    System.out.println("Calculo de precio por alumno");
	    System.out.print("N�mero de alumnos: ");
	    numeroAlumnos = lector.nextInt();
	
	    if (numeroAlumnos >= 100) {
	      System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " "
	          + "costo por cada alumno es de  65 euros");
	    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
	      System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
	          + "costo por cada alumno es de  70 euros");
	    } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
	      System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
	          + "costo por cada alumno es de  95 euros");
	    } else {
	      System.out.println("El coste del autob�s es de 4000 euros y cada alumno "
	          + "debe pagar " + (4000/numeroAlumnos) + " euros.");
	    } 
		
		
		
		
		

	}

}
