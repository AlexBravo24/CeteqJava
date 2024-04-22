package com;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		//ARRAYS o arreglos son una estructura de datos que nos permiten almacenar un tipo de datos en com�n
		//una especie de colecci�n de datos
		
		//Formas de declarar un ARRAY
		//Declarando un array de n�meros enteros
		
		int[] numeros = new int [5];
		//Guardar o asignar valores a cada posici�n del Array
		
		numeros [0] = 1;
		numeros [1] = 10;
		numeros [2] = 20;
		numeros [3] = 30;
		numeros [4] = 40;
		
		//numeros [5] = 50; //No se puede imprimir dado que el array tiene un tama�o declarado (en este caso =5)
		//Imprimir en consola
		
		System.out.println(numeros [4] );
		
		
		//Declarando un scanner para solicitar los valores por teclado
		
		Scanner input = new Scanner(System.in);
		int [] numeros2  = new int [5];
		for (int i =  0; i<numeros2.length; i++) {
			System.out.println("Ingrese un n�mero " +i);
			numeros2 [i] = input.nextInt();
		}
	//Si ya no utilizo mi scanner para introducir datos , lo correcto ser�a cerrarlo para ahorrar en la memoria
		
		input.close();
		
		System.out.println(numeros2[3] );
		
		

	}

}
