package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// ENTRADA DE DATOS POR TECLADO
		// Se hace utilizando a la clase Scanner
		
//		Scanner entrada = new Scanner (System.in);
//		
//		// Una vez que podamos ingresar datos por teclado son necesarias
//		// las variables adecuadas para guardarlos
//		
//		// next.Int
//		int numero;
//		System.out.println("Introduce un número:");
//		numero = entrada.nextInt(); // con nextint estoy solicitando la entrada de un número entero que se guardará en la variable numero
//	
//		System.out.println("Introduce otro número:");
//		int numero2 =entrada.nextInt();
//		
//		System.out.println("La suma de ambos es: " + (numero + numero2));
//		
//		// next
//		String nombre;
//		System.out.println("Introduce tu nombre: ");
//		nombre = entrada.next();
//		
//		System.out.println("Tu nombre es: " + nombre);
//		//Con .next en cuanto detecte un espacio despues de la primer cadena de caracteres omite lo demas y por ende no envia el msj completo si escribo más de una palabra en este caso
//		
//		// nextLine
//		String nombre2;
//		System.out.println("Introduce tu nombre mas un apellido: ");
//		entrada.nextLine(); // coloco esto para consumir el espacio previo a aplicar el .nextLine para que funcione correctamente
//		nombre2 = entrada.nextLine(); // con .nextLine puedo escribir mas de una cadena de caracteres dejando espacios entre cada una y que las imprima en la consola sin omitir ninguno
//		
//		System.out.println("Tu nombre mas un apellido es: " + nombre2);
		
		// para volver todo comentario o que busquemos ocultar/no ejecutar del código, se selecciona y se presiona ctrl+7
		// tambien se puede si encapsulo lo que deseo omitir como un comentario de multiples lineas como ayuda de "/*" al principio y "*/" al final de mi seleccion
		
		// OPERADOR DE MÓDULO
		//Sirve para indicar el valor residual de una división
		
		int n = 10;
		
		int divisor = 2;
		// el operador "/" sirve para realizar divisones
		// El operador "%" me devuelve el valor del resiudo de la división 
		
		int resultado = n/divisor;
		
		int residuo = n%divisor;
		
		System.out.println("El resultado de la divisón es:" + resultado + " y el residuo es:" + residuo);
		
		
	}

}
