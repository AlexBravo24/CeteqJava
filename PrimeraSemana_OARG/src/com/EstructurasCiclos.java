package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS O tambien llamados BUCLES
		//Estructuras que nos van a permitir repetir sentencias o procesos
		
		//WHILE - indterminado - mientras se cumpla una condición
		
		int x=1;
		
		System.out.println("Probando el ciclo WHILE ()");
		
		while (x<5) { //mientras cumpla esta condición 
			//ejecutamos este bloque de codigo
			System.out.println("Hola mundo " + x);
			//podemos recurrir a un incremento en la variable para controlar este ciclo
			// x=x+1;Incrementar el valor de x, por lo que vale +1 (x++;)
			x++;
		}
		
		//DO-WHILE 
		//Ejecutar el codigo al menos 1 vez y después pregunta si se sigue realizando
		//De esta formaaseguramos que si la condición puede no llegar a cumplirise
		//EL programa si se ejecute 1 vez 
		System.out.println("Probando el ciclo DO-WHILE ");
		do {//Haz o ejecuta el siguiente codigo
           System.out.println("Hola mundo do-while ");
	} while(x==10);
		
		//FOR- Ciclo determinado
		
		//para ( estas condiciones) realizar lo siguiente
		//para (una variable con un valor; una condición; un incremento)
		System.out.println("Probando el ciclo FOR");
		for (int i=1; i<=5; i++) {
			System.out.println("Hola mundo "+ i);
		}
		}
}
