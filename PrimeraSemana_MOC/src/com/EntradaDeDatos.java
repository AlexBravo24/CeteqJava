package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		// Entrada de datos <<Por teclado>>
		// Utilizaremos a la clase Scanner
		
	Scanner entrada= new Scanner(System.in);
//		
//		//Una vez podamos ingersar datos por teclado, necesitamos las
//		//variables adecuadas para poder guardarlos
//		int numero;
//		System.out.println("Introduce un número");
//		numero=entrada.nextInt();
//		System.out.println("Introduce otro número");
//		int numero2=entrada.nextInt();
//		System.out.println("La suma de ambos es: "+(numero+numero2));
//		
		//solicitar cadenas de texto
		String nombre;
		System.out.println("Introduce tu nombre");
	//	entrada.nextLine();// El metodo .nextLine nos permite consumir los espacios
		//que tambien son caracteres. en ocasiones cuando utilizamos el scanner, se
		//queda un espacio en buffer y cuando entra en accion lo que hace es consumir el espacio
		nombre=entrada.nextLine();
		
		System.out.println("Tu nombre es: "+ nombre);
		
		
		//Operador de modulo-Sirve para indicar el valor de residuo de una division
		int n=10;
		int divisor=2;
		//El operador modulo devuelve l valor del residuo de la division 
		
		int resultado=n%divisor;
		System.out.println(resultado);
	}

}
