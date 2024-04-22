package com.condicionales;

import java.util.Scanner;

public class Condicionales9_AAAM {

	public static void main(String[] args) {
//		Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
//		correspondiente. Si introducimos otro número nos da un error.

		int x;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número del día de la semana:");
		x = entrada.nextInt();
		if (x ==1) {
			System.out.println("El día de la semana es Lunes");
		}else if (x ==2 ) {
			System.out.println("El día de la semana es Martes");
		}else if (x ==3 ) {
			System.out.println("El día de la semana es Miercoles");
		}else if (x ==4 ) {
				System.out.println("El día de la semana es Jueves");
		}else if (x ==5 ) {
			System.out.println("El día de la semana es Viernes");
		}else if (x ==6 ) {
			System.out.println("El día de la semana es Sabado");
		}else if (x ==7 ) {
				System.out.println("El día de la semana es Domingo");
		}else {
			System.out.println("Error: El numero " + x + " no corresponde a ningún día de la semana");
		}
		

	}

}
