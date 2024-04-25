package com.condicionales;

import java.util.Scanner;

public class DiaDeLaSemana {
public static void main(String[] args) {
	System.out.println("Día de la semana");
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa un numero de día");
	int DiaSemana = entrada.nextInt();
	switch (DiaSemana) {
	case 1:
		System.out.println("El día es lunes");
		break;
	case 2:
		System.out.println("El día es martes");
		break;
	case 3:
		System.out.println("El día es miercoles");
		break;
	case 4:
		System.out.println("El día es jueves");
		break;
	case 5:
		System.out.println("El día es viernes");
		break;
	case 6:
		System.out.println("El día es sabado");
		break;
	case 7:
		System.out.println("El día es domingo");
		break;
	default:
		System.out.println("ERROR: número incorrecto");
		break;
	}
}
}
