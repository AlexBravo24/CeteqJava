package com.condicionales;

import java.util.Scanner;

public class Condicionales7_ADCA {

	public static void main(String[] args) {
        /*El director de una escuela est� organizando un viaje de estudios y requiere 
		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
		alumno por el viaje.*/
		int numeroDeAlumnos;
		int pagoAutobus;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el numero de estudiantes");
		numeroDeAlumnos = entrada.nextInt();
		if(numeroDeAlumnos >= 100){
			pagoAutobus = numeroDeAlumnos * 65;
			System.out.println("El pago por alumno es de 65 Euros y el total a pagar es: " + pagoAutobus);
		}else if(numeroDeAlumnos >= 50 && numeroDeAlumnos <= 99) {
			pagoAutobus = numeroDeAlumnos * 70;
			System.out.println("El pago por alumno es de 70 Euros y el total a pagar es: " + pagoAutobus);
		}else if(numeroDeAlumnos >= 30 && numeroDeAlumnos <= 49) {
			pagoAutobus = numeroDeAlumnos * 95;
			System.out.println("El pago por alumno es de 95 Euros y el total a pagar es: " + pagoAutobus);
		}else if(numeroDeAlumnos <= 29){
			pagoAutobus = 4000;
			System.out.println("El total a pagar es: " + pagoAutobus);

		}
			

	}

}
