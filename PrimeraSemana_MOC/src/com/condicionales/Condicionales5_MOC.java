package com.condicionales;

import java.util.Scanner;

public class Condicionales5_MOC {

	public static void main(String[] args) {
// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//* Otros casos -> NO ACEPTADA
	
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa tu Nota: ");
		int N; //Nota
		N=entrada.nextInt();
		
		System.out.println("Ingresa tu edad: ");
		int e;//edad
		e=entrada.nextInt();
		
		System.out.println("Ingresa tu sexo (M o F)");
		String s;
		entrada.nextLine();
		s=entrada.nextLine();
		
		
		if((N>=5) && (e>=18) && (s.toUpperCase().equals("M"))) {
			System.out.println("Posible");
		}
		else if((N>=5) && (e>=18) && (s.toUpperCase().equals("F"))) {
			System.out.println("Aceptada");
		}
		else {
			System.out.println("No aceptada");
		}
		
	}

}
