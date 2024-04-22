package com;

import java.util.Scanner;

public class Tarea_Array2 {

	public static void main(String[] args) {
		int [] num  = new int [100];
		
		int x = 0;
		int suma=0;
		while(x<100) {
			x++;//acumulador
			suma=suma+x;
		}
		
		double media = suma/100;//DECIMALES
		
		System.out.println("La suma de los números es: "+suma);
	
		System.out.println("La media es "+media); 
	
		
		

	}

}
