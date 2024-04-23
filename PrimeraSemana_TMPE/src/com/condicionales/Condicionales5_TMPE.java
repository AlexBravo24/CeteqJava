package com.condicionales;

import java.util.Scanner;

public class Condicionales5_TMPE {

	public static void main(String[] args) {
		// 5.Realiza un programa que calcule la aceptación de una solicitud 
		//en base a los siguientes parámetros: edad, nota y sexo. 

		 //Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 //Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 //Otros casos -> NO ACEPTADA

		Scanner lector = new Scanner(System.in);
		int edad;
		int nota;
        String sexo;
        
        System.out.println("Aceptación de una solicitud");
        System.out.println("edad");
        edad = lector.nextInt();
        System.out.println("nota");
        nota = lector.nextInt(); lector.nextLine ();
        System.out.println("Sexo (M o F): ");
        sexo = lector.nextLine();
        
        if (!sexo.toUpperCase().equals ("M") &&
        	!sexo.toUpperCase().contentEquals("F")) {
        	System.out.println("El valor del sexo introducido es incorrecto");
        }else if ((nota >= 5) && (edad >=18) &&
        		(sexo.toUpperCase().equals ("M"))) {
        	System.out.println("POSIBLE");
        }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
           System.out.println("ACEPTADA");
        }else {
            System.out.println("NO ACEPTADA");
        	
     
 }
        
        
	}

}
