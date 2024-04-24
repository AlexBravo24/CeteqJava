package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras condicionales o de decision
		//if -evalua valores booleanos
		
		int x =10;
		if(x<10) { //si (esto es verdad) ejecutara lo siguiente
			System.out.println("Si");
		}else {//de otro modo ejecuta lo siguiente
			System.out.println("No");
			
		}
		
		//operadores logicos
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//Condiciones compuestas
		//AND - && - Devuelve el valor true cuando se cumplen 
		// todas las condiciones
		
		if (x<=11 && x>8) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		
		if (x<=11 && x>8 && x ==9) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		//OR - || - Devolver el valor true cuando se cumpla al menos 
		//UNA de las condiciones
		if (x<=10 || x>8 || x== 9) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		//DIFFERENTE DE - != - Comprara los valores y devuelve true
		//true si los valores son diferentes
		System.out.println("Resultado Operador logico DIFERENTE DE COMPARADOR");
		if (x != 10 || x > 8 || x == 9) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		//IGUALDAD o comparacion - == - Compara si los valores son iguales 
		// y devuelve true cuando esto se cumple
		
		// un solo igual "=" significa asignacion
		// int = 10; (aqui asigno o guardo el valor de 10  en mi variable int)
		System.out.println("Resultado Operador logico DIFERENTE DE IGUALDAD");
		if (x == 10) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		//NOT ! Niega una condicion o mas bien , cambia el valor de true 
		// a falce y viceversa
		
		System.out.println("Resultado Operador logico DIFERENTE DE NOT");
		if (!(x == 10)) {
			System.out.println("si");
		}else {
			System.out.println("no");
			}
		
		//Estructura if-else anidado o concatenado
		
		int dia = 5;
		if(dia ==1) {
			System.out.println("lunes");
		}else if(dia ==2) {
			System.out.println("martes");
		}else if(dia ==3) {
			System.out.println("miercoles");
		}else if(dia ==4) {
			System.out.println("jueves");
		}else if(dia ==5) {
			System.out.println("viernes");
		}
		// ESTRUCTURA DE DECISION SWITCH-CASE
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("vienes");
			break;
		default:
			System.out.println("Error de dia");
			break;
		}

	}

}
