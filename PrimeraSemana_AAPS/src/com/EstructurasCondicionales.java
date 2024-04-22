package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// ESTRUCTURAS CONDICIONALES O DE DECISIÓN
		// if son lo que evaluan valores booleanos ( o sea si una condiciones es true or false)

		System.out.println("Resultado del IF:");
		int x = 10;
		
		if (x<10) { // si esto es verdad entonces ejectura lo siguiente
			System.out.println("Si");
		} else {// de otro modo, si la conidicon no se cumple ejecuta lo siguiente
			System.out.println("No");
		}
		
		// OPERADORES LOGICOS
		// son tales como AND, OF, NOT, DIFERENTE DE, IGUALIDAD
		
		// CONDICIONES COMPUESTAS
		// AND "&&" devuelve el valor true cuando se cumplan todas las condiciones
		System.out.println("Resultado del operador lógico AND: ");
		if (x<11 && x>8 && x==9) { 
			System.out.println("Si");
		} else { 
			System.out.println("No");
		} // cierre del else
		
		//OR "||" devuelve el valor true cuando se cumpla al menos una de las condiciones
		System.out.println("Resultado del operador lógico OR: ");
		if (x<10 || x>8 || x==9) { 
		System.out.println("Si");
		} else { 
		System.out.println("No");
		} //cierre del else 
		
		//DIFERENTE DE "!=" compara valores y devuelve true si estos valores son diferentes
		System.out.println("Resultado del operador lógico DIFERENTE DE: ");
		if (x!=20) { 
		System.out.println("Si");
		} else { 
		System.out.println("No");
		} // cierre del else
		
		// IGUALDAD O COMPARACIÓN "=="compara si los valores son iguales y devuelve true cuando se cumple
		// un solo simbolo de "=" inidica ASIGNACIÓN, por ejemplo si: int x = 10, por lo tanto asigno o guardo el valor 10 en mi variable entera
		System.out.println("Resultado del operador lógico IGUALDAD: ");
		if (x==10) { 
		System.out.println("Si");
		} else { 
		System.out.println("No");
		} // cierre del else
		
		//NOT "!" niega una condición o más bien cambia  el valor de true a flase y viceversa
		System.out.println("Resultado del operador lógico NOT: ");
		if (! (x==10) ) { 
		System.out.println("Si");
		} else { 
		System.out.println("No");
		} // cierre del else
		
		
		//ESTRUCTRUA IF-ELSE ANIDADO O CONCATENADO
		System.out.println("Estrcutrua de IF-ELSE anidado: ");
		
		int dia= 5;
		
		if (dia == 1) { 
			System.out.println("Lunes");
		} else if (dia == 2) {
			System.out.println("Martes");
		}else if (dia == 3) { 
				System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else { 
			System.out.println("Error de dia");
		}
		
		// ESTRUCTURA DE DECISIÓN SWITCH-CASE
		
		System.out.println("Estrcutrua de SWITCH-CASE: ");
		
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martess");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Vierness");
			break;
		default:
			System.out.println("Error de dia");
			break;
		}
		
	} // cierre del main

} // cierre de la clase 
