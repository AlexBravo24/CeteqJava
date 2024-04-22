package com.condicionales;

import java.util.Scanner;

public class Condicionales5_EDB {

	public static void main(String[] args) {
		
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo.  
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE  
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA  
		//* Otros casos -> NO ACEPTADA
		
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int edad;
		String sexo;
		
		System.out.println("Ingrese la Nota: ");
		nota = entrada.nextInt();
		System.out.println("Ingrese la Edad: ");
		edad = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Ingrese el sexo (M o F)");
		sexo = entrada.nextLine();
		
		if ((nota>=5) && (edad>=18) && (sexo.toUpperCase().equals("M"))) {
			System.out.println("POSIBLE");
		}else if (nota>=5 && edad>=18 && sexo.toUpperCase().equals("F")) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}
			
		
		

	}

}
