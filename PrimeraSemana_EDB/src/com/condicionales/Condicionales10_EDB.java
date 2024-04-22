package com.condicionales;

import java.util.Scanner;

public class Condicionales10_EDB {

	public static void main(String[] args) {
		
		//10.Realiza un programa que pida un número entero entre uno y doce e imprima 
		//el número de días que tiene el mes correspondiente.
		
		Scanner entrada = new Scanner(System.in);
		
		int mes;
		
		System.out.println("Ingresa un número de mes (entre 1 y 12)");
		mes = entrada.nextInt();
		
		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			System.out.println("El mes tiene 31 días");
		}else if (mes==4 || mes==6 || mes==9 || mes==11) {
			System.out.println("El mes tiene 30 días");
		}else if (mes==2) {
			System.out.println("Este mes podria tener 28 o 29 días");
		}else {
			System.out.println("Error de mes");
		}

	}

}
