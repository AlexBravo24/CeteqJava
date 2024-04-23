package com.ciclos;

import java.util.Scanner;

public class Ciclos2_SHF {

	public static void main(String[] args) {
		
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??? 

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserte el numero multiplicador: ");
		int multiplicador = entrada.nextInt();
		
		System.out.println("Introdusca el numero de iteraciones deseada: ");
		int iteracion = entrada.nextInt();
		
		System.out.println("Tabla de multiplicar del " + multiplicador + " : ");
		
		for(int i=0; i <= iteracion; i++) {
			int resultado = multiplicador * i;
			System.out.println(i + " x " + multiplicador + " = " + resultado);
		}
	}

}
