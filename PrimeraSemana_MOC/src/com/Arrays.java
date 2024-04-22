package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		/*Los Arrays, o tsmbién conocidos como vectores
		 * son una estructura de datos que nos permiten almacenar
		 * un tipo de datos en comun.
		 *  Son una especie de coleccion de datos 
		 * 
		 */
		//Una vez declarado su tamaño o longitus, este no puede crecer
		//en tiempo de ejecucion
		
		//Formas de declarar un Array
		//Declarando un array de numeros enteros con su tamaño
		int [] numeros=new int[5];
		
		//Guardar o asignar valores a cada posicion de Array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		//numeros[5]=15;// si quiero agregar una posicion mas, puedo hacerlo, porque la sintaxist
		//es correcta, sin embargo el indice no existe porque el array tiene declarado imprimir
		//el array en consola determinada posicion
		
		//Imprimir en consola determinada posicion del array
		System.out.println(numeros[4]);
		
		//Declarando un scanner para solicitar datos por teclado
		Scanner input=new Scanner(System.in);
		
		int[] numero2=new int[5];
		
		for (int i = 0; i < numero2.length; i++) {
			System.out.println("Ingresa un numero en la posicion "+i);
			numero2[i]=input.nextInt();
		}
		
		//Si ya no utilizo Scanner lo correcto es cerrarlo para ahorrar recursos en memoria
		input.close(); 
		
		//Vamons a imprimir un valor guardado una vez teniendo numeros en el array
		System.out.println(numero2[3]);
		
		for (int i = 0; i < numero2.length; i++) {
			System.out.print(numero2[i]+ " ");
		}
		
		//Otra manera de declarar un Array es con sus valores definido desde el inicio
		int [] numeros3= {1,2,3,4,5};
		
		//Array de caracteres
		char[] nombre= {'A','l','e'};
		
		//Array de String
		String [] nombres= {"Abraham","Rafael","Jafet" };
		
		//Otra forma de imprimir los valores de un array es con un ciclo for each
		//Para cada elemento del array imprimelo cada uno en una nueva linea
		for(String i:nombres) {
			System.out.println(i);
		}
		
		//como puedo tener un array que e permita almacenar datos de tipo entero, 
		//decimales, caracteres, cadenas de texto, etc, en un mismo array
		
		//Podemos tener un array de elementos tipo objeto y asi almacenar esta supuesta
		//de diferente tipo de datos
		
		Object nombre5="Maryjose";
		Object entero=342;
		
		//Se utiliza un array de tipo object
		Object[] mezcla= {1,2,"Majo","Alex",'A',true};
	}

}
