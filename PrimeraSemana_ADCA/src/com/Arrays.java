package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//Arrays
		//los arrays, arreglos o vectores
		// son una estructura de datos que nos permiten
		//almacenar un tipo de datos en comun
		//son una especie de coleccion de datos
		//Una vez declarado su tamaño o longitud, este no puede creecer
		//en tiepmo de ejecucion
		
		//forma de declarar un array
		// declarando un array de numeros enteros con su tamaño
		int[] numeros = new int [5];
		 //fuardad o asignar valores a cada posicion del array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		//imprimir en consola determinada posicion de arrat
		//System.out.println(numeros[4]);
		
		//declarando un scanner parar solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int[] numeros2 = new int[5];
		
//		for(int i = 0; i < numeros2.length; i++) {
//			System.out.println("ingresa un nuemro en la posicion" + i);
//		numeros2[i] = input.nextInt();	
//		}
		
		//si ya no utilizo mi scanner para intrucir datos,
		//lo correcto seria cerrarlo para ahorrar recursos 
		//de memoria
		//input.close();
		
		//vamos a imprimir un valor guardado una vez teniendo los numeros
		//en el array
		//System.out.println(numeros2[3]);
		//o para imprimir todos puedo hace ruso nuevamente de un ciclo
//		for (int i = 0; i < numeros2.length; i++) {
//			System.out.print(numeros2[i] + ", ");
		//}
		//otra manera de decarar un array
		//es con sus valores definidos desde un inicio
		int[] numeros3 = {1,2,3,4,5};
		
		char[] nombre = {'A', 'l', 'e', 'x'};
		
		String[] nombres = {"abraham","rafael","jafet","jareth","marcos"};
		//otra forma de imprimir todos los valores de un array
		//es con un ciclo for each
		for(String i:nombres) { // para cada elemento del array
			System.out.println(i);//imprime cada uno en nueva linea
		}
	}

}
