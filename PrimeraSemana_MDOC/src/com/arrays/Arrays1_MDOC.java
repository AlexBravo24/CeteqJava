package com.arrays;

import java.util.Scanner;

public class Arrays1_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Este programa genera una Array de 10 posiciones con los valores que ingrese. \r\n"
				+ "Ingresa 10 números a continuación (no olvides separarlos con un ENTER):");
		
		 Scanner ar =new Scanner(System.in);
		 
		 int [] arreglitos = new int [10];
		 
		 for (int in =0; in < arreglitos.length; in++) {
			 arreglitos [in]=ar.nextInt();
		 } ar.close();
		 		 
		 for (int a =0; a < arreglitos.length; a++) {
			 System.out.println("En la posición [" + a + "] se asignó el valor: " +arreglitos[a]);
		 }
			 		 

	}

}
