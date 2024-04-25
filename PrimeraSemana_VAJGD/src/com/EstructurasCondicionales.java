package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras condicionales o de decision
		//if - Evaluan valores booleanos
		//Operadores logicos
		//AND/OR/NOT/DIFERENTE DE/ IGUALDAD
		//AND && DEVUELVE TRUE CUANDO S CUMPLEN TODAS LAS CONDICIONES
		//IGUALDAD == Devuelve true cuando la condicion es igual
		//OR - || Devuelve true cuando se cumpla al menos una de las condiciones
		//DIFERENTE DE -!= Devuelve true si los valores son diferentes 
		//NOT - ! Niega una condicion cambiandola de true a false y viseversa
		//para hacer esto debemos encerrar la condicion en parentesis 
		//de la siguiente manera (!(Condicion a evaluar))
		int x = 12;
		if(!(x==12)) {
			System.out.println("Si");
		}
		else {
			System.out.println("No");
		}
		//Estructura if/else anidado o concatenado
		
		System.out.println("If anidado");
		int dia = 12;
		if(dia ==1) {
		System.out.println("Lunes");
		}
		else if(dia ==2) {
		System.out.println("Martes");
		}
		else if(dia ==3) {
		System.out.println("Miercoles");
		}
		else if(dia ==4) {
		System.out.println("Jueves");
		}
		else if(dia ==5) {
		System.out.println("Viernes");
		}
		else if(dia ==6) {
		System.out.println("Sabado");
		}
		else if(dia ==7) {
		System.out.println("Domingo");
		}
		else {
		System.out.println("Dia incorrecto");
		}
		
		//para imprimir switch de manera rapida se escribe 
		//switch + ctrl + espacio ya solo se cambia el key por nuestra variable
		//Estructura de desicion switch case
		System.out.println("Switch-Case");
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
		case 6:
			System.out.println("Sabado");	
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