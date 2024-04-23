package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);

		int numero1;
		System.out.println("Introduce el primer número");
		
		numero1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo número");
		int numero2= entrada.nextInt();
		
		System.out.println("La suma de ambos numeros es: " + (numero1 + numero2));
		
		String nombre;
		System.out.println("Introduce tu nombre");
		entrada.nextLine();
		nombre = entrada.nextLine();
		
		System.out.println("Tu estupido nombre es: " + nombre);
	}

}
