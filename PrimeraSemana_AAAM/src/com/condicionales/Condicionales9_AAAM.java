package com.condicionales;

import java.util.Scanner;

public class Condicionales9_AAAM {

	public static void main(String[] args) {
//		Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
//		correspondiente. Si introducimos otro n�mero nos da un error.

		int x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el n�mero del d�a de la semana:");
		x = entrada.nextInt();
		if (x ==1) {
			System.out.println("El d�a de la semana es Lunes");
		}else if (x ==2 ) {
			System.out.println("El d�a de la semana es Martes");
		}else if (x ==3 ) {
			System.out.println("El d�a de la semana es Miercoles");
		}else if (x ==4 ) {
				System.out.println("El d�a de la semana es Jueves");
		}else if (x ==5 ) {
			System.out.println("El d�a de la semana es Viernes");
		}else if (x ==6 ) {
			System.out.println("El d�a de la semana es Sabado");
		}else if (x ==7 ) {
				System.out.println("El d�a de la semana es Domingo");
		}else {
			System.out.println("Error: El numero " + x + " no corresponde a ning�n d�a de la semana");
		}
		

	}

}
