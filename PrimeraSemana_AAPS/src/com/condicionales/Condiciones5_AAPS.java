package com.condicionales;

import java.util.Scanner;

public class Condiciones5_AAPS {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
		
		Scanner entrada = new Scanner (System.in);
		
		int a;
		
		int b;
		
		String c;
		
		System.out.println("Ingresa una nota: ");
		a = entrada.nextInt();
		
		System.out.println("Ingresa una edad: ");
		b = entrada.nextInt();
		
		System.out.println("Ingresa tu sexo (M ó F): ");
		c = entrada.next(); //aqui solo .next porque quiero recoger un solo caracter o un bloque de caracteres sin espacios	
		
		if (a>=5 && b>=18 && (c.toUpperCase().equals("M"))) {System.out.println("Es posible que su solicitud sea aceptada");
		} else if (a>=5 && b>=18 && (c.toUpperCase().equals("F"))) {System.out.println("Su solicitudad será aceptada");
		} else {System.out.println("Su solicitud no será acetpada");}
			
	}

}
