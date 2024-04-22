package com;

import java.lang.invoke.SwitchPoint;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras condicionales o de decision
		//If- evaluan valores booleanos
		int x=10;
		
		if (x<10) { //si esto es verdad se ejecuta lo siguiente
			System.out.println("Si");
		}
		else { //si la condicion NO se cumple ejecuta lo siguiente
			System.out.println("No");
		}
       
		
		//OPERADORES LOGICOS
		//And, or, not, diferente de, igualdad
		
		//Condiciones compuestas
		//AND && Devuelve true cuando se cumplen todas las condiciones
		System.out.println("Resultado del operador logico AND");
		if(x<11 && x>8 && x==9) {
		System.out.println("Si");
		}
		else {
		System.out.println("No");
		}
		System.out.println("Resultado del operador logico OR");
		//OR || devuelve el valor true si alguna de las condiciones se cumple
		if(x<11 || x>8 || x==9) {
			System.out.println("Si");
			}
			else {
			System.out.println("No");
			}
		
		//Diferente de != comprara los valores y devuelve true si los valores son diferentes
		System.out.println("Resultado operador logico diferente de");
		if(x!=20) {
			System.out.println("Si");
			}
			else {
			System.out.println("No");
			}
		//Igualdad o comparacion == compara si los valores son iguales y es cuando da true
		System.out.println("Resultado operador logico igual");
		if(x==10) {
			System.out.println("Si");
			}
			else {
			System.out.println("No");
			}
		
		//operador NOT niega una condicion o más bien cambia el valo de 
		//true a false o viseversa
		System.out.println("Resultado operador logico NOT");
		if(!(x==10)) {
			System.out.println("Si");
			}
			else {
			System.out.println("No");
			}
		
		System.out.println("Estructura if-else anidado");
		//Estructura if-else anidado o concatenado
		int dia=5;
		
		if(dia==1) {
			System.out.println("Lunes");
		}
		else if(dia==2) {
			System.out.println("Martes");
		}
		else if(dia==3) {
			System.out.println("Miercoles");
		}
		else if(dia==4) {
			System.out.println("Jueves");
		}
		else if(dia==5) {
			System.out.println("Viernes");
		}
		else {
			System.out.println("Error de dia");
		}
		
		System.out.println("Resultado swith case");
		//Estructura de decision switch case
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
							
		default:
			System.out.println("Error de dia");
			break;
		}
		
	
		} //Cierre del main
		
}//Cierre de la clase
