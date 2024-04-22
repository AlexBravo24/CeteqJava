//Realiza un programa que pida un número por teclado y nos indique si es par o impar.


package com;

import java.util.Scanner;

public class Tarea_ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("Introduce un número");
    	int numero = entrada .nextInt();
    	if (numero % 2 ==0) {
    	System.out.println("Es par");
    	}else {
    		System.out.println("Es impar");
    	}
    	
    	

	}

}
