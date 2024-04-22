package com.condicionales;

import java.util.Scanner;

public class Condicional5_OARG {

	public static void main(String[] args) {
		
	/*Realiza un programa que calcule la aceptación de una solicitud en base a
     los siguientes parámetros: edad, nota y sexo.
     Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
    Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
    Otros casos -> NO ACEPTADA
    */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("El programa nos indica si eres aceptado o no en base a los siguientes parametros. ");
		
		double nota;
		System.out.println("Ingresa tu nota: ");
		nota=entrada.nextDouble();
		
		int edad;
		System.out.println("Ingresa tu edad: ");
		edad=entrada.nextInt();
		String M="M";
		String F="F";
		String sexo;
		System.out.println("Introduce tu sexo (M o F): ");
		sexo=entrada.next();
		
		
//		if (!sexo.equals(M) || !sexo.equalsIgnoreCase(F)) {
//			System.out.println("EL CARACTER DE SEXO ES INCORRECTO. "+ " POR FAVOR, REENVIE EL FORMULARIO");
//			
//		} 
		if (nota>5 && edad>= 18 && sexo.equalsIgnoreCase(M)) {
			System.out.println("POSIBLE");
		}
		
		else if (nota>5 && edad>= 18 && sexo.equalsIgnoreCase(F)) {
			System.out.println("ACEPTADA");
		}else if (nota<=5 || edad<18 || sexo.equalsIgnoreCase(M) || sexo.equalsIgnoreCase(F)){
			System.out.println("NO ACEPTADO");
		}
		
	}

}
