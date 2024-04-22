package com.condicionales;

import java.util.Scanner;

public class Condicionales10_AAAM {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y doce e imprima 
		// el número de días que tiene el mes correspondiente.
		
int x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número del mes:");
		x = entrada.nextInt();
		if (x ==1) {
			System.out.println("Enero tiene 31 días");
		}else if (x ==2 ) {
			System.out.println("Febrero tiene 29 días");
		}else if (x ==3 ) {
			System.out.println("Marzo tiene 31 días");
		}else if (x ==4 ) {
				System.out.println("Abril tiene 30 días");
		}else if (x ==5 ) {
			System.out.println("Mayo tiene 31 días");
		}else if (x ==6 ) {
			System.out.println("Junio tiene 30 días");
		}else if (x ==7 ) {
				System.out.println("Julio tiene 31 días");
		}else if (x ==8 ) {
			System.out.println("Agosto tiene 31 días");
		}else if (x ==9 ) {
			System.out.println("Septiembre tiene 30 días");
		}else if (x ==10 ) {
				System.out.println("Octubre tiene 31 días");
		}else if (x ==11 ) {
			System.out.println("Noviembre tiene 30 días");
		}else if (x ==12 ) {
			System.out.println("Diciembre tiene 31 días");
		}else {
			System.out.println("Error: El numero " + x + " no corresponde a ningún mes del año");
		}

	}

}
