package com.condicionales;

import java.util.Scanner;

public class Condicionales5_ADCA {

	public static void main(String[] args) {
		/*  Realiza un programa que calcule la aceptación de una solicitud en base a 
		los siguientes parámetros: edad, nota y sexo.  
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE  
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA  
		* Otros casos -> NO ACEPTADA */
		int edad;
		int nota;
		char sexo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca su edad");
		edad = entrada.nextInt();
		System.out.println("Introduzca su nota");
		nota = entrada.nextInt();
		System.out.println("Introduzca su sexo (M) para masculino (F) para femenino");
		sexo = entrada.next().charAt(0);
		
		if(edad >= 18 && nota >= 5 && sexo == 'M') {
			System.out.println("POSIBLE");
			
		}else if(edad >= 18 && nota >= 5 && sexo == 'F') {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
		

	}

}
