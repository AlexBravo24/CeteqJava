package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//Arrays
		//Arrays o tambien conocidos como vectores son una estructura
		//de datos que nos permite almacenar un tipo de datos en comun
		
		//una vez declarado su tamaño o longitud este no puede crecer
		
		//Formas de declarar un array
		//Declarando un array de numeros enteros con su tamaño	
		int [] numeros = new int [5];
		
		//Guardar o asignar valores a cada posicion del array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		//Si agregamos una posicion mas se puede hacer ya que la sintaxis
		//es correcta, sin embargo al ejecutarlo nos dara un mensaje de error
		System.out.println(numeros[3]);
		
		//Scanner para solicitar los valores para un array
		int [] numeros2 = new int [5];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingrese el numero que se asignara a la poscion "+i);
			numeros2[i]=entrada.nextInt();
		}
		for (int j = 0; j < numeros2.length; j++) {
			System.out.println("El numero en la posicion "+ j+ " es: "+ numeros2[j]);
		}
//		Cuando se deja de usar el Scanner lo correcto es cerrarlo para ahorrar memoria
		entrada.close();
		//Otra forma de declarar un array es con sus valores definidos desde un inicio
		int[] numeros3 = {1,2,3,4,5};
		char[] letras = {'V','i','n','c','e'};
		String[] nombres = {"Vince", "Axel","Jesus","Adrian"};
	
		//Otra forma de imprimir todos los valores de un array es con uun ciclo 
		//for each
		
		for(String i:nombres){
			System.out.println(i);
		}
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		//La teoria nos dice que los arrays son estructuras que nos permiten almacenar
		//elementos
	
		//Una pregunta de entrevista puede ser:
		//¿Como puedo tener un array que me permita almacenar datos de tipo entero,
		//decimal,caracteres,cadenas de texto en un mismo array?
	
		//para esto podemos tener un array de elementos de tipo objeto
		//y asi almacenar diferentes tipos de dato
		
		Object text = "text";
		Object entero = 10;
	
		Object[]Mezclaz = {1,3.1416,"Vince",'A',true};
	
	
	
	
	}

}
