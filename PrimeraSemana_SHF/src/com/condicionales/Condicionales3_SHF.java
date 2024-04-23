package com.condicionales;

import java.util.Scanner;

public class Condicionales3_SHF {

	public static void main(String[] args) {

		//3.Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduca el primer número: ");
		double numero1= entrada.nextDouble();
		
		System.out.println("Introduca el segundo número: ");
		double numero2= entrada.nextDouble();
		
		if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por 0.");
        } else {
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        }
		
	}

}
