package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		//Nos permite almacenar datos de forma tabular pasando a un concepto tabla permitiendonos tener datos
		//filas y columnas
		
		//Declarar un Array de dos dimensiones
		//Con su tamaño incial
		
		int [] [] matriz = new int [3][3];
		
		// = 
		// [0,1] [0,2] [0,3]
		// [1,1] [1,2] [1,3]
		// [2,1] [2,2] [2,3]
		
		matriz [0] [0] = 1;
		matriz [0] [1] = 2;
		matriz [0] [2] = 3;
		
		matriz [1] [0] = 4;
		matriz [1] [1] = 5;
		matriz [1] [2] = 6;
		
		matriz [2] [0] = 7;
		matriz [2] [1] = 8;
		matriz [2] [2] = 9;
		
		//Declarando una matriz o array bidimensional con valores asignados desde el inicio
		
		int [] [] matriz2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(matriz2.length);
		
		for (int i = 0; i < matriz2.length; i++) {
		for (int j = 0; j < matriz2.length; j++) {
		
		System.out.println(matriz2 [i][j]+"");
			
		}
			
		}
		
		//Clase en java que nos permite almacenar mas de un tipo de dato
		
		Object [] array = {1, "Alex", "B", 1000.50};
		for (Object i:array) {
		System.out.println(i);
		}

	}

}
