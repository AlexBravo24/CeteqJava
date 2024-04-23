package com.condicionales;

import java.util.Scanner;

public class Condicionales5_SHF {

	public static void main(String[] args) {

//		5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a 
//		los siguientes par�metros: edad, nota y sexo.  
//		* M�nimo: Nota (5), edad (18), sexo M -> POSIBLE  
//		* M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA  
//		* Otros casos -> NO ACEPTADA 
		
	Scanner entrada= new Scanner(System.in);
	
	System.out.println("ingrese la nota: ");
	int nota = entrada.nextInt();
	
	System.out.println("ingrese la edad: ");
	int edad = entrada.nextInt();
	
	System.out.println("ingrese el sexo M(masculino) y F(femenino): ");
	char sexo = entrada.next().charAt(0);
	
	if(nota>=5 && edad>=18){
		
        if (sexo == 'M') {
            System.out.println("POSIBLE: La solicitud es posible.");
        } else if (sexo == 'F') {
            System.out.println("ACEPTADA: La solicitud ha sido aceptada.");
        } else {
            System.out.println("Sexo no v�lido.");
        }
    } else {
        System.out.println("No cumple con los requisitos m�nimos.");
    }
	
	}

}
