package com.ciclos;

import java.util.Scanner;

public class Ciclos2_EDB {

	public static void main(String[] args) {
		
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??? 
		
		Scanner entrada = new Scanner(System.in);
		int x;
		int numero;
	
		System.out.println("Ingresa un número");
		x= entrada.nextInt();
		
		System.out.println("Ingresa hasta que iteracion se desea multiplicar");
		numero= entrada.nextInt();
		
		System.out.println("Tabla de multiplicar del " + x + " hasta el " + numero);
		
		for (int i=1; i<=numero; i++) {
			System.out.println(x + " * "+ i + " = " + (x*i));
		}

	}

}
