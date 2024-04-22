package com.condicionales;

import java.util.Scanner;

public class Condicionales9_MDOC {

	public static void main(String[] args) {
		
		System.out.println("¡Hola! Éste programa te dirá el día de la semana correspondiente al número que ingrese");
		System.out.println("Añade un número entre el 1 y el 7:");
		
		Scanner usuario = new Scanner(System.in);
		int dia = usuario.nextInt();
		
		System.out.println("Elegiste el día:");
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;	
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Error, número de día inválido");
			break;
		}

	}

}
