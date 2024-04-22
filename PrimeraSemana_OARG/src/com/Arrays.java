package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
//	/*  son una especie de colección de datos una vez declarado su tamaño o longitud, este no puede crecer
//		en tiempo de ejecución 
//	*/
//		
//		//Firmas de declarar un array
//		
//		//Declarando un array de numeros enteros con su tamaño
//		
//		int [] numeros = new int [5];
//		
//		//Como guardar o asignar5 valores a cada posición del Array
//		
//		numeros[0]=1;
//    	numeros[1]=10;
//     	numeros[2]=20;
//		numeros[3]=30;
//		numeros[4]=40;
//		
//	    //numeros[5]=15; //si quieeo agregar una psoición más
//		               // puedo "hacerlo", porque la sintaxis es correcta, sin embargo
//		               //el índice no existe, porque el array ya tiene un tamaño declarado.
//		
//		//Imprimir en consola determinada posición del Array
//		
//		System.out.println(numeros[4]);
//		
//		//Declarando un Scannr para solicitar los valores por teclado
//		
//		Scanner input=new Scanner(System.in);
//		
//		int[] numeros2 = new int [5];
//		
//		for (int i = 0; i < numeros2.length; i++) {
//			System.out.println("Ingresa un numero en la posición " +i);
//			numeros2[i]=input.nextInt();
//			
//		}
//		
//		//Si ya no utilizo mi Scanner para introducir datos
//		//lo correcto sería cerrarlo para ahorrar recursos en memoria 
//		input.close();
//		
//		//Vamos a imprimir un valor guardado una vez teniendo numeros en el array
//		
//		System.out.println(numeros2[3]);
		
		//para imprimirlos todos puedo hacer uso nuevamente de un ciclo
		
//		for (int i = 0; i < numeros2.length; i++) {
//			System.out.print(numeros2[i]+ ", ")
//			;
//		}
		
		//Otra manera de declarar un Array
		//Es con sus valores definidos desde un inicio 
		
		int[] numeros3 = {1,2,3,4,5};
		
		char[]nomnbre = {'O','B','E','D'};
		
		String [] nombres = {"Obed","Armando","Rosas","Galvan"};
		
		//Otra forma de impriumir todos los valores de un Array
		//Es con un ciclo for each
		
		for (String i : nombres) { //Para cada elemento del array
			System.out.print(i+" "); //Imprimelo cada uno en un
		}
		
		
		//¿CÓMO PUEDO TENER UN ARRAY QUE ME PERMITA ALMACENAR DATOS DE TIPO ENTERO, DECIMALES
		//CADENAS DE TEXTO, ETC, EN UN MISMO ARRAY?
		
		//Pdemos tener un Array de elementos tipo Objetos
		//y así almacenar esta "supuesta"de diferentes tipos de datos
		
		Object texto = "Texto";
		Object entero =1001;
		
		Object []mezcladito= {1,3.1416,"Obed",'A',true};
		
		 //double resultado = mezcladito[0] + mezcladito[1];
		 
		

	}

}
