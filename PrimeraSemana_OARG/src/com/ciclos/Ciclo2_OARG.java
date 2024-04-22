package com.ciclos;

import java.util.Scanner;

public class Ciclo2_OARG {

	public static void main(String[] args) {
//      Programa un algoritmo que realice la tabla de multiplicar de un numero
//		introducido desde teclado, hasta la iteración deseada por el usuario.
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		
		//Clase Scanner para entrada datos
		Scanner cadena= new Scanner(System.in);
		
		//Declarar variable
		int n;
		
		//salida de instrucciones y guardado de dato en variable
		System.out.println("Introduce el numero del que deseas saber la tabla de multiplicar: ");
		n=cadena.nextInt();
		
		
		//Declarar variable
		int iteracion;
		
		//Salida de texto y guardar datos en variable
		System.out.println("Introduce el numero de Iteraciones que deseas saber: ");
		iteracion= cadena.nextInt();
		
		//Inicio de Ciclo
		for (int i=1; i<=iteracion;i++) {
			
			//Salida de resultado
			System.out.println(n+" * "+i+ " = "+n*i);
			
		}
		}

	}


