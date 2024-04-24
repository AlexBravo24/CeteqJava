package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Entrada de datos
		//por teclado
		
		//utilizamos a la clase Scanner
		
		Scanner entrada = new Scanner(System.in);
		//Una vez podemos ingresar dots por teclado, necesitamos las
		//variables adecuadas para poder guardarlos
		int numero;
		System.out.println("Introduce un numero:");
		numero = entrada.nextInt();
		System.out.println("Introduce otro numero");
		int numero2 = entrada.nextInt();
		
		System.out.println("La suma de ambos numeros es: " + (numero + numero2));
		
		String nombre;
		System.out.println("Introduce tu nombre");
		entrada.nextLine();
		nombre = entrada.nextLine();
		
		System.out.println("Tu nombre es " + nombre);
		
		//seleccionar lo que no necesitamos ejecutar del codigo
		// y control + 7, se comentan las lineas seleccionadas
		
		//operador de modulo - sirve para indicar el valor del residuo
		//de una division
		
		int n = 10;
		
		int divisor = 3;
		//el operador % me devuelve el valor del reciduo de la division
		int resultado = n%divisor;
		
		System.out.println(resultado);
		

	}

}
