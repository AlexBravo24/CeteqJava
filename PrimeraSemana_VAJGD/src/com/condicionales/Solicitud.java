package com.condicionales;
import java.util.Scanner;
public class Solicitud {

	public static void main(String[] args) {
//		Realiza un programa que calcule la aceptación de una solicitud en base a
//		los siguientes parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa tu nota del 1 al 10");
		int nota = entrada.nextInt();
		System.out.println("Ingresa tu edad: ");
		int edad = entrada.nextInt();
		System.out.println("Ingresa tu genero (M->Masculino / F->Femenino)");
		entrada.nextLine();
		String genero = entrada.next();
		genero = genero.toUpperCase();
		if(nota>=5 && edad>=18 && genero.equals("M")) {
			System.out.println("Posible");
		}
		else if(nota>=5 && edad>=18 && genero.equals("F")){
			System.out.println("Aceptada!!");
		}
		else {
			System.out.println("No aceptad@");
		}
		
	}

}
