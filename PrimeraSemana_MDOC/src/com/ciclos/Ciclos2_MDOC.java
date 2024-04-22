package com.ciclos;

import java.util.Scanner;

public class Ciclos2_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Este programa calcula la tabla de multiplicar del número que desees \r\n"
				+ "hasta el número que indiques. Ejemplo, la tabla del 10 hasta el 12 \r\n"
				+ "sería la tabla de multiplicar del 10 hasta el -10 x 12 = 120- \r\n"
				+ "Ingresa el número de la tabla que deseas:");

		
		int t = 1;
		
		Scanner p =new Scanner(System.in);
				
		int iu=p.nextInt();
		
		System.out.println("Ingresa el número en el que quieres que se detenga:");
		int tu=p.nextInt();
		p.close();
		
		System.out.println("¡Gracias! La tabla de multipicar del " + iu + " es:");
		
		while (t<=tu) {
			System.out.println(iu + " x " + t + " = " + (iu*t));
			t++;
		}
		
		
	}

}
