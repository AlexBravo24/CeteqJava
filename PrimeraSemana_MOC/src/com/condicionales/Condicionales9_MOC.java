package com.condicionales;

import java.util.Scanner;

public class Condicionales9_MOC {

	public static void main(String[] args) {
		// Realiza un programa que pida el d�a de la semana (del 1 al 7) y 
		//escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.
		
		Scanner entrada=new Scanner(System.in);
		int dia;
		System.out.println("Introduce el n�mero de d�a");
		dia=entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("El d�a correspondiente es: Lunes");
			break;
		case 2:
			System.out.println("El d�a correspondiente es: Martes");
			break;
		case 3:
			System.out.println("El d�a correspondiente es: Miercoles");
			break;
		case 4:
			System.out.println("El d�a correspondiente es: Jueves");
			break;
		case 5:
			System.out.println("El d�a correspondiente es: Viernes");
			break;
		case 6:
			System.out.println("El d�a correspondiente es: S�bado");
			break;
		case 7:
			System.out.println("El d�a correspondiente es: Domingo");
			break;
		default:
			System.out.println("Error de dia");
			break;
		}
		

	}

}
