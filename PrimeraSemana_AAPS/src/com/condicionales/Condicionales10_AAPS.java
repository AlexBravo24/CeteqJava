package com.condicionales;

import java.util.Scanner;

public class Condicionales10_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno 
		// y doce e imprima el número de días que tiene el mes correspondiente.

		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		System.out.println("Ingresa un número entre el 1 y el 12 para saber de que mes se trata así como el número de dias que tiene");
		a = entrada.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("El mes de Enero tiene 31 días");
			break;
		case 2:
			System.out.println("El mes de Febrero tiene 28 o 29 días");
			break;
		case 3:
			System.out.println("El mes de Marzo tiene 31 días");
			break;
		case 4:
			System.out.println("El mes de Abril tiene 30 días");
			break;
		case 5:
			System.out.println("El mes de Mayo tiene 31 días");
			break;
		case 6:
			System.out.println("El mes de Junio tiene 30 días");
			break;
		case 7:
			System.out.println("El mes de Julio tiene 31 días");
			break;
		case 8:
			System.out.println("El mes de Agosto tiene 30 días");
			break;
		case 9:
			System.out.println("El mes de Septiembre tiene30 días");
			break;
		case 10:
			System.out.println("El mes de Octubre tiene 31 días");
			break;
		case 11:
			System.out.println("El mes de Noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("El mes de Diciembre tiene 31 días");
			break;
		default:
			System.out.println("Error");
			break;
			
		}
		
		
	}

}
