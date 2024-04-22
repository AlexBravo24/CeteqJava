package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		
		//CICLOS O BUCLES
		//SON ESTRUCTURAS QUE NOS PERMITEN REPETIR SENTENCIAS O PROCESOS
		
		//While es un ciclo indeterminado- mientras se cumpla una condición
		
		int x=1;
		System.out.println("Probando el ciclo while");
		while(x<5) {//mientras cumpla la condición 
			//Ejecutamos bloque de codigo
			
			System.out.println("Hola mundo"+x);
			//podemos acudir a un incremento en la variable para controlar el ciclo
			//x = x + 1//incrementar el valor de x por lo que vale +1
			x++;
			//DO - WHILE
			//Ejecutar el código al menos una vez , y después pregunta si se sigue realizando 
			//De esta forma aseguramos que si la condición puede no llegar a cumplirse 
			//El programa si se ejecuta una vez
			
			
		}
		
		System.out.println("Probando el ciclo Do");
		do {
			System.out.println("Hola mundo");
		}while(x==10);
		
		//FOR CICLO DETERMINADO
		//Para estas condiciones realizar lo siguiente para una variable que nos ayude con un cambio o valor-incremento
		
		for(int i = 1; i<=5; i++) {
			System.out.println("Hola mundo"+i);
		}
		
		

	}

}
