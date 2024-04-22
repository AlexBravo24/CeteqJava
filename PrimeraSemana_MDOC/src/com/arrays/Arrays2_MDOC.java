package com.arrays;

public class Arrays2_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Este programa muestra la suma y la media de 100 números. ");
		
		int [] cien = new int[100];
		int suma=0;
		for (int n=0; n<cien.length; n++) {			
			cien[n]=n+1;	
			suma += n+1;
		}
		
		System.out.println("La suma da "+suma);
		   System.out.println("El valor de la media es: "+(suma/cien.length));
		
//		for (int n=0; n<cien.length; n++) {
//			int s =cien[n]+cien[n+1];
//			System.out.println(s);
			
		}
		
//		for (int a =0; a < cien.length; a++) {
//			 System.out.println("En la posición [" + s + "] se asignó el valor: " +cien[a]);
//		 }
		
//		for (int a =0; a < cien.length; a++) {
//			 System.out.println("En la posición [" + a + "] se asignó el valor: " +cien[a]);
//		 }

	}


