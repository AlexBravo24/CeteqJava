package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS o BUCLES
		
		//Son estructuras que nos permiten repetir sentencias o procesos
		
		//while-> ciclo indeterminado, siguifica "mientras" se cumpla una condicion
		System.out.println("Probando el ciclo while");
		int x=1;
		while(x<5) { //mientras se cumpla la cndicion ejecutamos este bloque
			//de codigo
			System.out.println("Hola mundo "+ x);
			//podemos recurrir a un incremento en la vriable para controlar
			//el ciclo
			x++; //se le suma 1 a x
		}
		
		//DO-WHILE
		/*  
		 *Ejecuta el cogigo al menos 1 vez, y despues pregunta si se sigue realizando
		 *de esta forma aseguramos que si la condicion puede llegar a cumplirse el pr
		 *el programa se ejecute 1 vez
		 */
		System.out.println("probando el ciclo Do while");
		do {//haz o ejecuta el siguiente codigo
			System.out.println("Hola mundo");
			
		}while (x==10);
		
		//ciclo for ciclo determinado
		//Para (estas condiciones) realizar lo siguiente
		//Para (Una variable;una condicion; un incremento)
		System.out.println("Probando el ciclo for");
		for(int i=1;i<=5; i++) {
			System.out.println("Hola mundo "+i);
			
		}
	}

}
