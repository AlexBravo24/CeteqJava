package com.condicionales;

import java.util.Scanner;

public class Condicionales5_AAAM {

	public static void main(String[] args) {
// 		Realiza un programa que calcule la aceptación de una solicitud en base a 
//		los siguientes parámetros: edad, nota y sexo. 
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//		* Otros casos -> NO ACEPTADA

		int Nota;
		int Edad;
		String Sexo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la nota del alumno");
		Nota = entrada.nextInt();
		System.out.println("Introduce la edad del alumno");
		Edad = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Introduce el sexo del aumno (M o F)");
		Sexo = entrada.nextLine();
		Sexo = Sexo.toUpperCase();
		
		if (Nota >=5 && Edad >=18 && Sexo.contentEquals("M")) {
			System.out.println("ACEPTACION POSIBLE");
		}else if (Nota >=5 && Edad >=18 && Sexo.contentEquals("F")) {
			System.out.println("SOLICITUD ACEPTADA");
		}else {
			System.out.println("SOLICITUD NO ACEPTADA");
		}
		
		
		
		
	}

}
