package com;

public class ArrayBidimencional {

	public static void main(String[] args) {
		//Array bidimencional
		//nos permite almacenar datos de forma tabular pasando a un concepto de tabla
		//permitiendonos tener datos en filas y columnas
		
		//Declarar array 2D con su tamaño inicial
		
		int[][] matriz = new int[3][3];
		
		// [0,0] [0,1] [0,2]
		// [1,0] [1,1] [1,2]
		// [2,0] [2,1] [2,2]
		
		//ingreso de datos (una fila)
		matriz [0] [0] = 1;
		matriz [0] [1] = 2;
		matriz [0] [2] = 3;
		
		matriz [1] [0] = 4;
		matriz [1] [1] = 5;
		matriz [1] [2] = 6;
		
		matriz [2] [0] = 7;
		matriz [2] [1] = 8;
		matriz [2] [2] = 9;
		
		//Declarando una matriz o array bidimencional con valores asignados desde un inicio
		int [][] matriz2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		//para recorrer este array necesitamos dos ciclos for, uno anidad dentro del otro
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println(); // salto de liena para que se pueda visualizar como tabla
								  // si se elimina se verán seguidos
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j] + " "); //si se pone "println" sin el salto de linea anterior, se verá en forma de lista
				                                       // el (+ " ") es solo por estética
			}
		}
		
		
		
	}

}
