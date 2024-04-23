package com.condicionales;

import java.util.Scanner;

public class Condicionales7_SHF {

	public static void main(String[] args) {

//		7. El director de una escuela est� organizando un viaje de estudios y requiere 
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
//		alumno por el viaje. 

		
		Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el n�mero de alumnos:");
        int numAlumnos = entrada.nextInt();

        double costoAlumno;
        double costoTotalViaje;

        if (numAlumnos >= 100) {
            costoAlumno = 65;
            costoTotalViaje = numAlumnos * costoAlumno;
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            costoAlumno = 70;
            costoTotalViaje = numAlumnos * costoAlumno;
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            costoAlumno = 95;
            costoTotalViaje = numAlumnos * costoAlumno;
        } else {
            costoTotalViaje = 4000;
            costoAlumno = costoTotalViaje / numAlumnos;
        }

        System.out.println("El costo por alumno es de: " + costoAlumno + " euros.");
        System.out.println("El total a pagar a la compa��a de autobuses es de: " + costoTotalViaje + " euros.");

	
	}

}
