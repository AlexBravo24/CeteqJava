package com.condicionales;

import java.util.Scanner;

public class Condicionales2_SHF {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un n�mero por teclado y nos indique si es par o impar. 

		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un n�mero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El n�mero ingresado es par.");
        } else {
            System.out.println("El n�mero ingresado es impar.");
        }
	}

}
