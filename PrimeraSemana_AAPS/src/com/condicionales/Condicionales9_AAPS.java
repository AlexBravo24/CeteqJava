package com.condicionales;

import java.util.Scanner;

public class Condicionales9_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y 
		//escriba el día correspondiente. Si introducimos otro número nos da un error.
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		System.out.println("Ingresa un numero del 1 al 7 para saber a que día de la semana corresponde: ");
		a = entrada.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Se trata del día Lunes");
			break;
		case 2:
			System.out.println("Se trata del día Martes");
			break;
		case 3:
			System.out.println("Se trata del día Miercoles");
			break;
		case 4:
			System.out.println("Se trata del día Jueves");
			break;
		case 5:
			System.out.println("Se trata del día Viernes");
			break;
		case 6:
			System.out.println("Se trata del día Sabado");
			break;
		case 7:
			System.out.println("Se trata del día Domingo");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
	}

}
