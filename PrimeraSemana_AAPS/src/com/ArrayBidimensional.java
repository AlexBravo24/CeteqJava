package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
// ARRAY BIDIMENSIONAL
		// Permite almacenar datos de forma tabular pasando a un concepto de "tabla"
		// posibilitando tener datos en filas y columnas
		
		//Declarar un array de dos dimensiones con su tamaño incial
		
		int [][] matriz = new int [3][3];
		
		//Almacena, en este caso, como:
		// [0,0] [0,1] [0.2]
		// [1,0] [1,1] [1,2]
		// [2,0] [2,1] [2.2]
		// Son como coordenadas donde [numero de fila, numero de posición/columna]
		
	// FORMA 1 DE DECLARAR ARRAY BIDIMENSIONAL
		// Esto equivaldria a los datos almacenados a la primera fila:
		matriz [0] [0] = 1;
		matriz [0] [1] = 2;
		matriz [0] [2] = 3;
		
		// Esto equivaldria a los datos almacenados a la segunda fila:
		matriz [1] [0] = 4;
		matriz [1] [1] = 5;
		matriz [1] [2] = 6;
		
		// Esto equivaldria a los datos almacenados a la tercera fila:
		matriz [2] [0] = 7;
		matriz [2] [1] = 8;
		matriz [2] [2] = 9;
		
	//FORMA 2 DE DECLARAR ARRAY BIDIMENSIONAL
		// Declarando una matriz o array bidimensional con valores asignados desde un inicio
		
		int [][] matriz2 = {{1,2,3} , {4,5,6} , {7,8,9}}; // {{fila1}, {fila2}, {fila3}}
		
	 	System.out.println(matriz2.length);
		
		// Para recorrer el array en cualquiera de las formas (1 y 2), es necesario hacer 
		// dos ciclos for anidados uno con el otro
		
		for (int i=0; i<matriz2.length; i++) {
			System.out.println();
			for (int j=0; j<matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " " ); // DUDA: XQ SI LE AGREGO UNA FILA MAS NO PUTAS JALA
			}
		}
		// PREGUNTA CAPCIOSA: "¿existe una forma de almacenar en un array datos de diferente tipo?"
		// RESPUESTA : existe una clase en java que permite almacenar más de un tipo de dato que seria la clase "Object"
			System.out.println();
			
			Object [] array = {15, "Alex", "B", 10000.50};
		
			for(Object k:array) {
				System.out.println(k);
		}
	}	
}
