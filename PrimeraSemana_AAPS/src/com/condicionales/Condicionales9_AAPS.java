package com.condicionales;

import java.util.Scanner;

public class Condicionales9_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que pida el d�a de la semana (del 1 al 7) y 
		//escriba el d�a correspondiente. Si introducimos otro n�mero nos da un error.
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		System.out.println("Ingresa un numero del 1 al 7 para saber a que d�a de la semana corresponde: ");
		a = entrada.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Se trata del d�a Lunes");
			break;
		case 2:
			System.out.println("Se trata del d�a Martes");
			break;
		case 3:
			System.out.println("Se trata del d�a Miercoles");
			break;
		case 4:
			System.out.println("Se trata del d�a Jueves");
			break;
		case 5:
			System.out.println("Se trata del d�a Viernes");
			break;
		case 6:
			System.out.println("Se trata del d�a Sabado");
			break;
		case 7:
			System.out.println("Se trata del d�a Domingo");
			break;
		default:
			System.out.println("Error");
			break;
		}
		
	}

}
