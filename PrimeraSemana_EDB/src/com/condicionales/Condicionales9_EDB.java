package com.condicionales;

import java.util.Scanner;

public class Condicionales9_EDB {

	public static void main(String[] args) {
		
		//9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
		//correspondiente. Si introducimos otro n�mero nos da un error. 
		
		Scanner entrada = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Ingresa el n�mero de un dia de la semana");
		dia = entrada.nextInt();
		
		if (dia == 1) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if(dia == 3) {
			System.out.println("Miercoles");
		}else if(dia == 4) {
			System.out.println("Jueves");
		}else if(dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de dia");
		}
		

	}

}
