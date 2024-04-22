package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		/* ESTRUCTURAS CONDICIONALES O DE DESICION
		 * IF- evaluan booleanos
		 */
		int x = 10;
		
		// if - condicional 
//		if(x<10) { 
//			System.out.println("Sí");			
//		} else {
//			System.out.println("No");
//		}
		
		/*OPERADORES LÓGICOS
		 * AND, OR, NOT, DIFERENTE DE, IGUALDAD
		 * 
		 * Condiciones compuestas
		 * and -&&- devuelve el valor true cuando se cumplen todas 
		 * las condiciones
		 */
		
////		 AND - se deben cumplir ambas condiciones
//		if (x<10 && x>8) {
//			System.out.println("Sí");
//		} else {
//			System.out.println("No");
//		}
//		
////		  OR - con que se cumpla una o la otra
//		if (x<9 || x==8) {
//			System.out.println("Sí");
//		} else {
//			System.out.println("No");
//		}
		
////		 DIFERENTE DE
//		if (x!=9) {
//			System.out.println("Sí");
//		} else {
//			System.out.println("No");
//		}
		
////	 NOT - cambia de T a F, o al revés - se coloca antes
//		if (!(x == 10)) {
//			System.out.println("Sí");
//		} else {
//			System.out.println("No");
//		}
		
//		ESTRUCTURA if-else ANIDADO O CONCATENADO
		int dia=5;
		
//		if (dia==1) {
//			System.out.println("Lunes");
//		} else if (dia==2) {
//			System.out.println("Martes");
//		}else if (dia==3) {
//			System.out.println("Miercoles");
//		}else if (dia==4) {
//			System.out.println("Jueves");
//		}else if (dia==5) {
//			System.out.println("Viernes");
//		}else  {
//			System.out.println("Error de día");
//		}
		
//		ESTRUCTURA DE DESICIÓN con Switch-Case
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;	
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Error de día");
			break;
		}
		
		
		

	}

}
