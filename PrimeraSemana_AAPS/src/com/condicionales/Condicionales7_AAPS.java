package com.condicionales;

import java.util.Scanner;

public class Condicionales7_AAPS {

	public static void main(String[] args) {
		// El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe 
		// cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar 
		// es la siguiente: * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
		// * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. 
		// * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
		// Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar 
		// cada alumno por el viaje. 
		
		Scanner entrada = new Scanner (System.in);
		
		int a = 65; // 100 o mas alumnos
		int b = 70; // 50 a 99 alumnos
		int c = 95; // 30 a 49 alumnos
		int d = 4000; // menos de 30 alumnos
		int alumnosN;
		int precioInd;
		int precioTot;
		
		System.out.println("Ingresa el número de alumnos para conocer el costo individual por boleto y el total a pagar por todo el grupo: ");
		alumnosN=entrada.nextInt();
		
		if (alumnosN >= 100)  {
			precioInd = a;
			precioTot = a*alumnosN;
			System.out.println("El costo por alumno es de " + a + " euros y el total es de " + precioTot + " euros por todo el grupo ");
		
		} else if (alumnosN <= 99 && alumnosN >= 50) {
			precioInd = b;
			precioTot = b*alumnosN;
			System.out.println("El costo por alumno es de " + b + " euros y el total es de " + precioTot + " euros por todo el grupo");
		
		} else if (alumnosN >= 30 && alumnosN <= 49) {
			precioInd = c;
			precioTot = c*alumnosN;
			System.out.println("El costo por alumno es de " + c + " euros y el total es de " + precioTot + " euros por todo el grupo");
		
		} else if (alumnosN < 30) {
			precioInd = d;
			System.out.println("El costo por el total por grupo cuando es menor a 30 personas es de " + d + " euros");
		}
	}
}
