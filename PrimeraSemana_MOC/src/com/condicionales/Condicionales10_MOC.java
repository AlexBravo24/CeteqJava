package com.condicionales;

import java.util.Scanner;

public class Condicionales10_MOC {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero entero entre uno y 
		//doce e imprima el n�mero de d�as que tiene el mes correspondiente.
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce el n�mero de mes");
		num=entrada.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("El n�mero de d�as de Enero es 31");
			break;
		case 2:
			System.out.println("El n�mero de d�as de Febrero es 29");
			break;
		case 3:
			System.out.println("El n�mero de d�as de Marzo es 31");
			break;
		case 4:
			System.out.println("El n�mero de d�as de Abril es 30");
			break;
		case 5:
			System.out.println("El n�mero de d�as de Mayo es 31");
			break;
		case 6:
			System.out.println("El n�mero de d�as de Junio es 30");
			break;
		case 7:
			System.out.println("El n�mero de d�as de Julio es 31");
			break;
		case 8:
			System.out.println("El n�mero de d�as de Agosto es 31");
			break;
		case 9:
			System.out.println("El n�mero de d�as de Septiembre es 30");
			break;
		case 10:
			System.out.println("El n�mero de d�as de Octubre es 31");
			break;
		case 11:
			System.out.println("El n�mero de d�as de Noviembre es 30");
			break;
			
		case 12:
			System.out.println("El n�mero de d�as de Julio es 31");
			break;
		default:
			System.out.println("Error de n�mero de mes, ingresa un n�mero del 1 al 122");
			break;
		}
	}

}
