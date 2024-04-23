package com;

import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays 
		
	/*Los arrays o arregos, o también conocidos como "vectores"
	 * son una estructura de datos que nos permiten almacenar
	 * un tipo de datos en común
	 *Son una especie de colección de datos 
	 */
		
		//Una vez declarado su tamaño o longitud, este no puede crecer
		//en tiempo de ejecución
		

		//Formas de declarar un array
		
		//Declarar un array de numeros enteros como su tamaño
		int[] números = new int [5];
		
		//Guardar o asignar valores a cada posición del array
		números[0]=1;
		números[1]=10;
		números[2]=20;
		números[3]=30;
		números[4]=40;
		
		//Si quiero agregar una posición más, 
		//puedo "hacerlo", porque la sintaxis es correcta, sin embargo
		//el índice no existe, porque el array ya tiene un tamaño declarado
		//Imprimir en consola determinada posición del array (ejemplo)
		//numeros [5]=15; me saldrá error
		
	
		
		//También puede pedirse a través de scanner
		//Imprimir en consola determinada posición del array
		
	    //System.out.println(números[4]);
	
		//Declarando un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int [] números2 = new int [5];
		    for (int i = 0; i < números2.length; i++) {
			System.out.println("Ingresa un número en la posición " + i);
	    	números2[i]=input.nextInt();	}
				
		//NOTA: si ya no utilizo mi Scanner para introducir datos, 
		//lo correcto sería cerrarlo para ahorrar recursos en memoria
		input.close();
		
		//Vamos a imprimir un valor guardado una vez teniendo números en el arraty
//		System.out.println(números2[3]);
		 
//		O para imprimirlos todos puedo hacer uso nuevamente de un ciclo
//	for (int i = 0; i < números2.length; i++) {
//			System.out.print(números2[i]+ ",");		
//		}
		
		//Otra manera de declarar un array
		//Es con sus valores definidos desde un inicio
		int [] números3 = {1,2,3,4,5};
		
		char [] nombre = {'A','l','e','x'};  
		
		String [] nombres = {"Abrahan", "Rafael", "Jafet", "Jareth", "Marcos"};
		//Otra forma de imprimir todos los valores de un array
		//es con un ciclo for each
		
		for(String i:nombres) { //Para cada elemento del array 
			System.out.println(i); //imprimelo cada uno en una nueva línea
				}
		
		//¿CÓMO PUEDO TENER UN ARRAY QUE ME PERMITA ALMACENAR
		//DATOS DE TIPO ENTERO, DECIMALES, CARACTERES, CADENAS DE TEXTO
		//, ETC, EN UN MISMO ARRAY?
	
		//Podemos tener un array de elementos de tipo Objeto
		//y así almacenar esta "supuesta" de diferentes tipos de dato.
		
		Object texto = "Texto";
		Object entero = 1001;
		
		Object [] mezcladito = {1,3,1416, "Alex" , 'A', true};
		
		//double resultado = mezcladito [0] + mezcladito [1];
		
		
	}
		}
		
	
