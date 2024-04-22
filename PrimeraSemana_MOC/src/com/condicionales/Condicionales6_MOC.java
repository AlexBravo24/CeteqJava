package com.condicionales;

import java.util.Scanner;

public class Condicionales6_MOC {
public static void main(String[] args) {
	
	
	Scanner entrada=new Scanner(System.in);
	
	System.out.println("Ingresa el precio inicial del kilo de uva");
	int precioin=entrada.nextInt();
	System.out.println("Ingresa el tipo de Uva (A o B)");
	String tipo=entrada.next();
	System.out.println("Ingresa el tamaño de Uva (1 o 2)");
	int tamaño=entrada.nextInt();

	int preciof;
	
	if(tipo.toUpperCase().equals("A") && tamaño==1) {
		preciof=(precioin+20);
		System.out.println("El precio final del Kilo de Uva es: " + preciof);
	}
	else if (tipo.toUpperCase().equals("A") && tamaño==2) {
		preciof=(precioin+30);
		System.out.println("El precio final del Kilo de Uva es: " + preciof);
	}
	else if (tipo.toUpperCase().equals("B") && tamaño==1) {
		preciof=(precioin-30);
		System.out.println("El precio final del Kilo de Uva es: " + preciof);
	}
	else if (tipo.toUpperCase().equals("B") && tamaño==2) {
		preciof=(precioin-50);
		System.out.println("El precio final del Kilo de Uva es: " + preciof);
	}
	else {
		System.out.println("Verifica que el tipo o el tamaño sean validos");
	}
}
}
