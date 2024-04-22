package com.condicionales;

import java.util.Scanner;

public class Condicionales7_MOC {

	public static void main(String[] args) {
		// Precio de la renta del autobus y cobro por alumno

		Scanner entrada=new Scanner (System.in);
		int NumeroAl;
		int renta;
		int precioa;
		System.out.println("Ingresa el número de alumnos que asistirá al viaje: ");
		NumeroAl=entrada.nextInt();
		if(NumeroAl>=100) {
			System.out.println("El precio por alumno es de 65 euros");
			System.out.println("El pago que debe realizarse a la compañia de autobuses es de: " + (NumeroAl*65));
		}
		else if(NumeroAl>=50 && NumeroAl<=99) {
			System.out.println("El precio por alumno es de 70 euros");
			System.out.println("El pago que debe realizarse a la compañia de autobuses es de: " + (NumeroAl*70));
		}
		else if(NumeroAl>=30 && NumeroAl<=49) {
			System.out.println("El precio por alumno es de 95 euros");
			System.out.println("El pago que debe realizarse a la compañia de autobuses es de: " + (NumeroAl*95));
		}
		else if(NumeroAl<30 && NumeroAl>=0) {
			System.out.println("El precio por alumno es de " + (4000/NumeroAl) + " euros");
			System.out.println("El pago que debe realizarse a la compañia de autobuses es de 4000 euros");
		}
		else {
			System.out.println("Ingresa un número de almunos válido");
		}
	}

}
