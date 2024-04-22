package com.condicionales;

import java.util.Scanner;

public class Condicionales10_MOC {

	public static void main(String[] args) {
		// Realiza un programa que pida un número entero entre uno y 
		//doce e imprima el número de días que tiene el mes correspondiente.
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce el número de mes");
		num=entrada.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("El número de días de Enero es 31");
			break;
		case 2:
			System.out.println("El número de días de Febrero es 29");
			break;
		case 3:
			System.out.println("El número de días de Marzo es 31");
			break;
		case 4:
			System.out.println("El número de días de Abril es 30");
			break;
		case 5:
			System.out.println("El número de días de Mayo es 31");
			break;
		case 6:
			System.out.println("El número de días de Junio es 30");
			break;
		case 7:
			System.out.println("El número de días de Julio es 31");
			break;
		case 8:
			System.out.println("El número de días de Agosto es 31");
			break;
		case 9:
			System.out.println("El número de días de Septiembre es 30");
			break;
		case 10:
			System.out.println("El número de días de Octubre es 31");
			break;
		case 11:
			System.out.println("El número de días de Noviembre es 30");
			break;
			
		case 12:
			System.out.println("El número de días de Julio es 31");
			break;
		default:
			System.out.println("Error de número de mes, ingresa un número del 1 al 122");
			break;
		}
	}

}
