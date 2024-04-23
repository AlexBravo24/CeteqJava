package com.condicionales;

import java.util.Scanner;

public class Condiciolaes1_SHF {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales. 
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		int numero1= entrada.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int numero2= entrada.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("Los números son iguales: " + numero1 + " = " + numero2);
		}else {
			if(numero1 > numero2) {
				System.out.println("El numero mayor es: " + numero1);
			}else {
				System.out.println("El numero mayor es: " + numero2);
			}
		}

	}

}
