package com.condicionales;

import java.util.Scanner;

public class DiaDeLaSemana {
public static void main(String[] args) {
	System.out.println("D�a de la semana");
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa un numero de d�a");
	int DiaSemana = entrada.nextInt();
	switch (DiaSemana) {
	case 1:
		System.out.println("El d�a es lunes");
		break;
	case 2:
		System.out.println("El d�a es martes");
		break;
	case 3:
		System.out.println("El d�a es miercoles");
		break;
	case 4:
		System.out.println("El d�a es jueves");
		break;
	case 5:
		System.out.println("El d�a es viernes");
		break;
	case 6:
		System.out.println("El d�a es sabado");
		break;
	case 7:
		System.out.println("El d�a es domingo");
		break;
	default:
		System.out.println("ERROR: n�mero incorrecto");
		break;
	}
}
}
