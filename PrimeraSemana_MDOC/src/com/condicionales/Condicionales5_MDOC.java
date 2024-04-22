package com.condicionales;

import java.util.Scanner;

public class Condicionales5_MDOC {

	public static void main(String[] args) {

		System.out.println("Este es un programa de aceptación de solicitudes");
		System.out.println("Para aplicar su solicitud le solicitaremos Edad, Nota y sexo");
		
		int ed;
		int no;
		String se;
		
		Scanner uno = new Scanner(System.in);
		
		System.out.println("Por Favor, ingrese su Edad: ");
		ed = uno.nextInt(); 
		
		System.out.println("Por Favor, ingrese su Nota: ");
		no = uno.nextInt();
		
		System.out.println("Por Favor, ingrese su Sexo (M o F): ");
		se = uno.next();
		
		if ((ed>=18) && (no>=5) && (se.toUpperCase().equals("Masculino"))) {
			System.out.println("Tu solicitud posiblemente sea aceptada");
		} 
		else if ((ed>=18) && (no>=5) && (se.toUpperCase().equals("F"))) {
			System.out.println("¡Felicidades! Tu solicitud fue aceptada");
		} else {
			System.out.println("Lo sentimos, Tu solicitud No fue aceptada");
		}


	}

}
