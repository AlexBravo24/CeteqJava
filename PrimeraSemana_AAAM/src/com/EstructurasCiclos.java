package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//Ciclos o Bucles
		
		//Estructuras que nos permiten repetir sentencias o procesos 
		
		
		
		//while - indeterminado - mientras se cumpla una condicion
		
		int x = 1;
		System.out.println("CICLO WHILE");
		while (x<5) { // mientas se cumpla esta condicion ejecutamos este bloque de código
			System.out.println("Hola mundo " + x); //se imprmira al infinito ya que no se cumple con la condicion nunca
			x++; //recurrimos a un incremento en la variable para ontrolar el ciclo
		}
		
		
		
		
		// DO - WHILE - Ejecuta el codigo al menos una vez y despes pregunta si debe continuar
		//asi aseguramos que si la condicion puede no llegar a cumplise el programa si e ejecute una vez
		
		System.out.println(("CICLO DO WHILE"));
		do { //ejecuta el siguente código
			System.out.println("Hola mundo");
		}while (x==10); 
		
		
		
		
		//FOR - Ciclo determinado
		//Para estas condiciones realizar lo siuiente
		//Una variable con un valor (int i = 1; en el ejemplo); una condicon (i<=5); un incremento (i++)
		System.out.println("CICLO FOR");
		for (int i = 1; i<=5; i++) {
			System.out.println("Hola mundo " + i);
		}
		
		
		
	}
}
