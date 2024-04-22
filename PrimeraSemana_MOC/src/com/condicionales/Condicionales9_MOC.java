package com.condicionales;

import java.util.Scanner;

public class Condicionales9_MOC {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y 
		//escriba el día correspondiente. Si introducimos otro número nos da un error.
		
		Scanner entrada=new Scanner(System.in);
		int dia;
		System.out.println("Introduce el número de día");
		dia=entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El día correspondiente es: Lunes");
			break;
		case 2:
			System.out.println("El día correspondiente es: Martes");
			break;
		case 3:
			System.out.println("El día correspondiente es: Miercoles");
			break;
		case 4:
			System.out.println("El día correspondiente es: Jueves");
			break;
		case 5:
			System.out.println("El día correspondiente es: Viernes");
			break;
		case 6:
			System.out.println("El día correspondiente es: Sábado");
			break;
		case 7:
			System.out.println("El día correspondiente es: Domingo");
			break;
		default:
			System.out.println("Error de dia");
			break;
		}
		

	}

}
