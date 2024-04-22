package com.condicionales;

import java.util.Scanner;

public class Condicionales7_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Este programa determina el coste del viaje para los alumnos \r\n" +
							"según el número de inscritos al evento. \r\n" + 
							"Por favor intoduce el número de alumnos que participarán:");
		
		int a = 100;
		int b = 50;
		int c = 30;
		int d = 4000;
		
		Scanner i =new Scanner(System.in);
		int na = i.nextInt();
		
		if (na>=a) {
			System.out.println("El costo por alumno es de 65 euros, por lo tanto debe pagar " + (na*65) + " a la empresa de autobuses.");
		} else if (na<a && na>=b) {
			System.out.println("El costo por alumno es de 70 euros, por lo tanto debe pagar " + (na*70) + " a la empresa de autobuses.");
		} else if (na<b && na>=c) {
			System.out.println("El costo por alumno es de 95 euros, por lo tanto debe pagar " + (na*95) + " a la empresa de autobuses.");
		} else {
			int pq = d/na;
			System.out.println("El costo por alumno es de "+pq+" euros, por lo tanto debe pagar " + (na*pq) + " a la empresa de autobuses.");
		}
		
		
		


	}

}
