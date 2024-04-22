package com;

import java.util.Scanner;
import java.util.Scanner;
public class Tarea_ejercicio7 {

	public static void main(String[] args) {
		Scanner viaje =new Scanner(System.in);
		
		System.out.println("Introduce el numero de alumnos: ");
		int alumnos = viaje.nextInt();
		
		
		if(alumnos>=100) {
			int total = alumnos*65;
			System.out.println("El total a pagar es: "+total);
			System.out.println("Cada alumno pagará: "+65+" euros");
			
		}else if (alumnos>=50 && alumnos<=99) {
			int total=alumnos*70;
			System.out.println("El total a pagar es: "+total);
			System.out.println("Cada alumno pagará: "+70+" euros");
			
		}else if (alumnos>=30 && alumnos<=49) {
			int total=alumnos*95;
			System.out.println("El total a pagar es: "+total);
			System.out.println("Cada alumno pagará: "+95+" euros");
			
		}else if (alumnos<=30) {
			int total=alumnos*4000;
			System.out.println("El total a pagar es: "+total);
			System.out.println("Cada alumno pagará: "+4000+" euros");
			
		}
		

	
	
	
	}
	
	
	
	
	

}
