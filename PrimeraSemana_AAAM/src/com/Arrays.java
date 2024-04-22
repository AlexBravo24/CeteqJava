package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		//Arrays
		//los arrays o arreglos o tambien conocidos como "vectores" son una estructura de datos que
		//nos permiten almacenar un tipo de datos en comun son una especie de colección de datos.
		
		//una vez declarado su tamaño o longitud este no puede crecer en tiempo de ejecución
		
		//formas de declarar un array
		
		//declarando un array de numeros enteros con su taaño
		int [] numeros = new int [5];
		
		//Guardar o asiganar valores a cada posicion del array
		numeros [0]=1;
		numeros [1]=10;
		numeros [2]=20;
		numeros [3]=30;
		numeros [4]=40;
		
//		numeros [5]=15;//si se agrega una posicion mas se puede hacer porque la sintaxis es correcta
		//sin embargo el indice no existe porque array ya tiene un tamaño declarado
		//al llamarlo a consola mostrara error
		
		//imprimir en consola determinada posicion del array
		System.out.println(numeros[4]);
		
		//Declarado un scanner para solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int[] numeros2 = new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("ingresa un numero en la psicion " + i);
			numeros2[i]=input.nextInt();
		}
		
		
		
		
		//Si ya no se utiliza el Scanner para introducir datos, lo correcto es cerrarlo
		//para ahorrar recursos en memoria
		input.close();
		
		//Imprimir un valor guardado una vez teniendo nueros en el array
		System.out.println(numeros2[3]);
		
		//para imprimir todos puedo hacer uso de un ciclo
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2 [i]+ ", ");
			
		}
		
		
		
		
		//otra manera de declarar un array es con sus valores definidos desde el inicio
		int[] numeros3 = {1,2,3,4,5};
		
		char[] nombre = {'A','r','i','e','l'};
		
		String[] nombres = {"Ariel","Erick","Lilia","Joel"};
		
		//Otra forma de impriir todos los valores de un array es con ciclo each
		
		for (String i:nombres) { //Para cada elemento del array
			System.out.println(i); //Imprimelo cada uno en una nueva linea
			
		}
		
		
	
		
		//¿Como puedo tener un array que me permita almacenar datos de tipo 
		//entero, decimales, caracteres, cadenas de texto, etc. en un mismo array?
		
		//Podemos tener un array de elemetos de tipo objeto y asi almacenar esta supuesta
		//de diferentes tipos de dato
		
		Object texto = "Texto";
		Object entero = 1001;
		
		Object[] mezcladito = {1, 3.1416, "Ariel",'A', true};
		
		//double resultado = mezcladito[0] + mezcladito[1]; //no se pueden sumar entre ellos 
		//ya que no son compatibles
		
				
	}
	

}
