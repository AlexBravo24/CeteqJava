package com.condicionales;

import java.util.Scanner;

public class Condicional9_OARG {

	public static void main(String[] args) {
		
	// Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a
	//correspondiente. Si introducimos otro n�mero nos da un error.
		
		Scanner cadena = new Scanner (System.in);
		
	int dia;
	System.out.println("Ingresa un numero del 1 al 7 para saber que d�a de la semana es: ");
	dia=cadena.nextInt();
	
	switch (dia) {
	case 1:
		System.out.println("El d�a 1 de la semana es Lunes");
		break;

	case 2:
		System.out.println("El d�a 2 de la semana es Martes");
		break;
		
	case 3:
		System.out.println("El d�a 3 de la semana es Miercoles");
		break;
		
	case 4:
		System.out.println("El d�a 4 de la semana es Jueves");
		break;
		
	case 5:
		System.out.println("El d�a 5 de la semana es Viernes");
		break;
		
	case 6:
		System.out.println("El d�a 6 de la semana es Sabado");
		break;
		
	case 7:
		System.out.println("El d�a 7 de la semana es Domingo");
		break;
		
	default:
		System.out.println("Este numero de d�a no existe");
		break;
	}	
				

	}

}
