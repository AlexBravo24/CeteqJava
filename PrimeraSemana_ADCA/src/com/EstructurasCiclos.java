package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Ciclos o tambien llamados bucles
		// estructutas que nos permiten repetir sentencias
		// o procesos
		int x = 1;
		while(x<5) {
			System.out.println("hola mundo");
			// podemos recurrir a un incremento en la variable
			// para controlar el ciclo
			x++;
		}
		//DO - WHILE
		//ejecutar el codigo por lomenos una vez y despues pregunta si se sigue realizando
		//de esta forma aseguramos que si la condicion puede no llegar a cumplirse
		// el programa si se ejecute 1 vez
		System.out.println("probando el ciclo DO-WHILE");
		do {
			System.out.println("hola mundo do - while");
		}while(x==10);
		
		//FOR - ciclo determinado
		
		//para estas condiciones ealizar lo siguiente
		//para una variable con un valor; una condicion; un incremento
		System.out.println("probando el ciclo FOR");
		for(int i=1; i<=5; i++) {
			System.out.println("hola mundo" + i);
		}
			
	}

}
