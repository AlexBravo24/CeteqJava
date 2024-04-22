package com;

public class Tarea_Array4 {

	public static void main(String[] args) {
		
		
		int[] numeros = new int [5];
		//Guardar o asignar valores a cada posición del Array
		
		numeros [0] = 1;
		numeros [1] = 2;
		numeros [2] = 3;
		numeros [3] = 4;
		numeros [4] = 5;
		
		System.out.println("Array inverso");
		
		for(int i=numeros.length-1; i>=0; i--) {
			
			System.out.println(numeros[i]);
			
		}
		

	}

}
