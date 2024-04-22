package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS O BUCLES
		// Estructuras que nos van a permitir repetir sentencias o procesos

		// WHILE
		// "mientras" - mientras se cumpla una condición
		
		int x = 1;
		System.out.println("Probando el ciclo WHILE");
		
		while (x < 5) {
			//Aqui ejecuto lo que esté dentro de la llave; mientras se
			// cumpla la condición se utiliza este bloque de código
			System.out.println("Hola " + x);
			//Puedo recurri a un incremento en la variable para
			//controlar este ciclo
			x=x+1; // tambien lo puedo escribir como: x++
		}
			
			
		// DO WHILE
		// Ejectua el codigo al menos una vez y despues pregunta si se sigue realizando
		// de modo que se asegura que si la condición no llega a cumplirse
		// el programa si se ejecute una vez
		
		System.out.println("Probando el ciclo DO WHILE");
		do {//ahora esto seria un "haz o ejectua esto"
				System.out.println("Hello");
		
		} while  (x == 10);
		
		// FOR
		// es como "para esta condiciones realizar lo siguiente". es un ciclo determinado
		
		System.out.println("Probando el ciclo FOR");
		for(int i = 2 ; i<=5; i++) { //estructura como: (variable ; condición; incremento) 
			System.out.println("HI" + i);
		}
	}
}

