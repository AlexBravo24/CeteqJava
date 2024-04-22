package com.condicionales;

import java.util.Scanner;

public class Condicionales8_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Éste programa identifica el número de la cara contraria al valor obtenido al lanzar un dado");
		System.out.println("Por favor, ingresa el número obtenido al lanzar el dado: ");
		
		int cara; 
		
		Scanner num = new Scanner(System.in);
		cara =num.nextInt();
		
		switch (cara){
		case 1:
			System.out.println("Seis");
			break;
		case 2:
			System.out.println("Cinco");
			break;
		case 3:
			System.out.println("Cuatro");
			break;
		case 4:
			System.out.println("Tres");
			break;
		case 5:
			System.out.println("Dos");
			break;	
		case 6:
			System.out.println("Uno");
			break;
		default:
			System.out.println("ERROR: número incorrecto");
			break;
		}
		
		

	}

}
