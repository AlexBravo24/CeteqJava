package com.condicionales;

import java.util.Scanner;

public class Condicionales9_MDOC {

	public static void main(String[] args) {
		
		System.out.println("�Hola! �ste programa te dir� el d�a de la semana correspondiente al n�mero que ingrese");
		System.out.println("A�ade un n�mero entre el 1 y el 7:");
		
		Scanner usuario = new Scanner(System.in);
		int dia = usuario.nextInt();
		
		System.out.println("Elegiste el d�a:");
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;	
		case 6:
			System.out.println("S�bado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Error, n�mero de d�a inv�lido");
			break;
		}

	}

}
