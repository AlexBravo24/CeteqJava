package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AAAM {

	public static void main(String[] args) {
		
		double PI;
		int Tama�o;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el precio inicial");
		PI = entrada.nextDouble();
		
		
		System.out.println("Introduce el tipo de uva (A o B)");
		entrada.nextLine();
		String Tipo = entrada.nextLine();

		
		if (Tipo.equalsIgnoreCase("a")) {
			System.out.println("Selecciona el tama�o de la uva (1 o 2)");
			Tama�o = entrada.nextInt();
			if (Tama�o == 1) {
				System.out.println("el precio de venta es " + (PI + .20));
			}else if (Tama�o == 2) {
				System.out.println("el precio de venta es " + (PI + .30));
			}else {
				System.out.println("Tama�o de uva invalido, intente de nuevo");
			}
		
			
		}else if (Tipo.equalsIgnoreCase("b")) {
			System.out.println("Selecciona el tama�o de la uva (1 o 2)");
			Tama�o = entrada.nextInt();
			if (Tama�o == 1) {
				System.out.println("el precio de venta es " + (PI - .30));
			}else if (Tama�o == 2) {
				System.out.println("el precio de venta es " + (PI - .50));
			}else {
				System.out.println("Tama�o de uva invalido, intente de nuevo");
			}
			
			
		}else {
			System.out.println("Tama�o invalido, intente de nuevo");
		}
		
	}

}
