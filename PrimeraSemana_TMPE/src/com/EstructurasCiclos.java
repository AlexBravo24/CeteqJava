package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o tambi�n llamados BUCLES
		
		//Estructuras que nos van a permitir repetir sentencias
		//o procesos
		
		//while - indeterminado - mientras se cumpla una condici�n
		
		int x  = 1;
        System.out.println("Probando el ciclo while()");        
 
		while (x<5) { // mientras (se cumpla esta condicion)
			//Ejecutamos este bloque de c�digo
			System.out.println("Hola mundo " + x);
			//podemos recurrir a un incremento en la variable para 
			//controlar este ciclo
			//x = x + 1; //incrementar el valor de x, por lo que vale +1
			x++; 
			
			
			
			//Do - WHILE 
			//Ejecutar el codigo al menos 1 vez, y despu�s pregunta si se sigue realizando
			//De esta forma aseguramos que si la condici�n puede no llegar a cumplirse
			//El programa si se ejecuta 1 vez 
			
			System.out.println("Probando el ciclo DO/WHILE");
			
			
			do {  //Haz o ejecuta el siguiente codigo
				System.out.println("Hola mundo do-while" );
			}while (x==10);
			
			//FOR - Ciclo determinado 
			
			// para (estas condiciones) realizar lo siguiente
			// para (una variable con un valor; una condici�n; un incremento)
			System.out.println("Probando el ciclo FOR");
			
			for (int i = 1; i<=5; i++) {
            System.out.println("Hola mundo" + i);
            
			}
		
			}
			
		
	}
	
	
}
