package com.condicionales;

import java.util.Scanner;

public class Condicionales3_OARG {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos números y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner entrada= new Scanner(System.in);
		
		double numero1,numero2;
		
		
		System.out.println("Ingresa un numero para realizar una división ");
		numero1=entrada.nextDouble();
		
		System.out.println("Ingresa otro numero para realizar la división");
		numero2=entrada.nextDouble();
		
		double resultado=numero1/numero2;
		
		if (numero2==0) {
			System.out.println("Este numero no se puede dividir");
		}else {
			System.out.println("El resultado es: "+resultado);
		}
	}

}
