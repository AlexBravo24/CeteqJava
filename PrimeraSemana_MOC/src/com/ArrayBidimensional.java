package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array Bidimensional
		//Nos permite almacenar datos de forma tabular pasando a un concepto
		//de tabla permitiendonos tener datos en filas y columnas

		//Declarar un array de dos dimensiones con su tamaño inicia
		
		int[] [] matriz=new int[3][3];
		 //[0,0] [0,1] [0,2]
		 //[1,0] [1,1] [1,2]
		 //[2,0] [2,1] [2,2]
		
		matriz[0][0]=1;
		matriz[0][1]=2;
		matriz[0][2]=3;
		
		matriz[1][0]=4;
		matriz[1][1]=5;
		matriz[1][2]=6;
		
		matriz[2][0]=7;
		matriz[2][1]=8;
		matriz[2][2]=9;
		
		//Declando una matriz o array bidimensional con valores asignados
		//desde el inicio
		
		int[][] matriz2= {{1,2,3},{4,5,6},{7,8,9}};
		
		//Para recorrer este array se necesitan dos ciclos for anidados
		for (int i = 0; i < matriz2.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print(matriz2[i][j]+" ");
		}
		
	}
	}

}
