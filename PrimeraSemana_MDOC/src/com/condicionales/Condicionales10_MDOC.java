package com.condicionales;

import java.util.Scanner;

public class Condicionales10_MDOC {

	public static void main(String[] args) {
		
		System.out.println("�Hola! �ste programa te dir� el n�mero de d�as que contiene el mes seleccionado");
		System.out.println("Para saber cu�ntos d�as tiene el mes debes introducir el n�mero al que corresponde");
		System.out.println("ingresa un n�mero entero a continuaci�n:");
		
		Scanner usuario = new Scanner(System.in);
		int mes = usuario.nextInt();
		
		
		switch (mes) {
		case 1:
			System.out.println("Enero tiene 31 d�as");
			break;
		case 2:
			System.out.println("Febrero tiene 28 o 29 d�as");
			break;
		case 3:
			System.out.println("Marzo tiene 31 d�as");
			break;
		case 4:
			System.out.println("Abril tiene 30 d�as");
			break;
		case 5:
			System.out.println("Mayo tiene 31 d�as");
			break;	
		case 6:
			System.out.println("Junio tiene 30 d�as");
			break;
		case 7:
			System.out.println("Julio tiene 31 d�as");
			break;
		case 8:
			System.out.println("Agosto tiene 31 d�as");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 d�as");
			break;
		case 10:
			System.out.println("Octubre tiene 31 d�as");
			break;
		case 11:
			System.out.println("Noviembre tiene 30 d�as");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 d�as");
			break;
		default:
			System.out.println("�Ups! Recuerda que s�lo hay 12 meses");
			break;
		}
		

	}

}
