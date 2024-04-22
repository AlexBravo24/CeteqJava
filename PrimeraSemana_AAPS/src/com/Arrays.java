package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		// ARRAYS
		
		// Los Arrays, Arreglos o Vectores, son una estructura de datos que
		// permiten almacenar un tipo de datos en común; es una especie de 
		// colección de datos
		
		// Una vez declarado el tamaño o longitud, un Arrays no puede crecer
		// en tiempo de ejecución
		
		//  La formas de declarar un array pueden ser:
		
		// Declarando un arraye en numeros enteros con su tamaño
		
		int [] numeros = new int [5];

		// Guardar o asignar valores a cada posición del array
		
		numeros [0] = 1;
		numeros [1] = 10;
		numeros [2] = 20;
		numeros [3] = 30;
		numeros [4] = 40;
		
		// numeros [5] = 15; // Si quiero agregar una posición más puedo escribirlo porque la sintaxis es correcta, sin embargo, 
		//el indice no exsite porque el array ya tiene un tamaño declarado (en este caso de 5, que va de la posición 0 a la 4) y mandará error
		// Impimir en consola determinada posición del array
		
		System.out.println(numeros[4]);
		
		
		// Declarando un Scanner para solicitar los valores por teclado
		
		Scanner input = new Scanner(System.in);
		
		int [] numeros2 = new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
		
			System.out.println("Introduce un número en la posición: " + i);
		
			numeros2[i]=input.nextInt();
			
		}
		// Si ya no utilizo scanner para introducir datos, 
		// lo correcto seria cerrarlo para ahorrar recursos de memoria
		
		input.close();
		
		// Vamos a imprimir un valor guardado una vez teniendo numeros en el array
		
		System.out.println(numeros2[3]);
		
		// o para imprimirlos todos puedo hacer uso de un ciclo
		
		for(int i = 0; i < numeros2.length; i++) {
		
		System.out.print(numeros2[i] + " "); 
		}

		// Es con sus valores definidos desde un inicio
		
		int [] numeros3 = {1,2,3,4,5}; // array de numeros 
		
		char [] nombre = {'A','B','C'}; // array de caracteres
		
		String [] nombres = {"abraham", "rafael", "marcos", "fabian", "jafet"};  //array de cadenas de caracteres
		
		// Ahora, otra forma de imprimir todos los valores de un array
		// es con un ciclo "for each"
		
		for (String i:nombres) { // para cada elemento del array imprime cada uni en una nueva linea
			System.out.println(i);
		}
	}

}
