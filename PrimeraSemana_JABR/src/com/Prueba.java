package com;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el tipo de uva (A o B)");
		String Tipo = entrada.nextLine();

		if (Tipo.equalsIgnoreCase("a")) {
			System.out.println("Selecciona el tamaño de la uva");
		}else if (Tipo.equalsIgnoreCase("b)")) {
			System.out.println("Selecciona el tamaño de la uva");
		}else {
			System.out.println("Tamaño invalido, intente de nuevo");
		}

	}

}
