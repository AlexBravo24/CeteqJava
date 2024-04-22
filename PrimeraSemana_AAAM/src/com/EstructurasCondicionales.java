package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//ESTRUCTURAS CONDICIONALES O DE DESICIÓN
		//If - Evaluan valores booleanos
		
		int x = 10;
		System.out.println("RESULTADO CODIGO IF, ELSE");
		if (x < 10) { //Si (esto es verdad) {ejecuta lo siguiente
			System.out.println("si es menor");
		} else { //Si la condicion no se cumple, ejecuta lo siguiente
			System.out.println("no es menor");
		}

		
		
		
		
		//OPERADORES LÓGICOS
		//AND, OR, NOT, DFERENTE DE, IGUALDAD
		
		//Condiciones compuestas
		//And - && - devuelve el valor true cuando se cumplen todas las condiciones
		System.out.println("RESULTADO CODIGO AND");
		if (x<11 && x>8 && x==9) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		
		
		
		
		
		// OR - || - devolver el valor true cuando se cmpla al menos una condición
		System.out.println("RESULTADO CODIGO OR");
		if (x<10 || x>8 || x==9) {
			System.out.println("si");
		}else {
			System.out.println("no");
		}
		
		
		
		
		
		//Diferente de - != - Compara valores y devuelve true si estos valores son diferentes
		System.out.println("RESULTADO CODIGO DIFERENTE DE");
		if (x!=20) {
			System.out.println("si es diferente");
		}else {
			System.out.println("no es diferente");
		}
		
		
		
		
		
		//Igualdad o comparación - == - compara si los valores son iguales y devuelve true cuando se cumple
		System.out.println("RESULTADO CODIGO IGUALDAD, el valor de X es 10");
		if (x==10) {
		System.out.println("si es igual a 10");
		}else {
			System.out.println("no es igual a 10");
		}
		
		
		
		
		
		//Not - ! - niega una condicion o cambia el valor de true a false y viceversa 
		System.out.println("RESULTADO CODIGO NOT, el valor de X es 10");
		if (!(x==10)) {
		System.out.println("si es igual a 10");
		}else {
			System.out.println("no es igual a 10");
		}
		
		
		
		
		
		//Estructura if-else anidado o concatenado
		System.out.println("RESULTADO CODIGO IF-ELSE ANIDADO");
		int dia = 2;
		
		if (dia == 1) {
			System.out.println("Lunes");
		}else if (dia == 2) {
			System.out.println("Martes");
		}else if (dia == 3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("error de dia");
		}
		
		
		
		
		//Estructura de decisión switch-case
		System.out.println("RESULTADO CODIGO SWITCH-CASE");
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
			System.out.println("error de dia");
			break;
		}	
		
		
		
	} //Cierre de main

} //cierre de clase
