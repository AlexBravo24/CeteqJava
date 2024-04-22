//Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo. 

package com;
import java.util.Scanner;
public class Tarea_ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu sexo(H=hombre y  M= mujer) ");
		char sexo = entrada.next().charAt(0);
		
		System.out.println("Introduce tu edad: ");
		int edad=entrada.nextInt();
		
		System.out.println("Introduce tu nota: ");
		int nota = entrada.nextInt();
		
		if(sexo=='H') {
			System.out.println("Es posible que te acepten");
			
		}else if (sexo== 'H') {
			System.out.println("Usted está aceptada");
		}
		if(edad>18) {
			System.out.println("No es aceptada");
		}else if(sexo<=18) {
			System.out.println("Es aceptada");
		}
		if(nota<5) {
			System.out.println("No Aceptado");
		}else if(nota>=5) {
			System.out.println("Aceptado");
		}
	}

}
