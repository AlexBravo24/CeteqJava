package com.condicionales;

import java.util.Scanner;

public class Condiciolaes1_SHF {

	public static void main(String[] args) {
		
		// 1.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es 
		//mayor o si son iguales. 
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero: ");
		int numero1= entrada.nextInt();
		
		System.out.println("Introduce el segundo n�mero: ");
		int numero2= entrada.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("Los n�meros son iguales: " + numero1 + " = " + numero2);
		}else {
			if(numero1 > numero2) {
				System.out.println("El numero mayor es: " + numero1);
			}else {
				System.out.println("El numero mayor es: " + numero2);
			}
		}

	}

}
