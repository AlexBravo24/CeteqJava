package com.arrays;

public class Arrays2_MOC {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 1 al 100.
		//Obt�n la suma de todos ellos y la media.
		
		int [] numero= new int[100];
		int suma = 0;
		for (int i =0; i <numero.length; i++) {
			numero[i]=i+1;
			 //System.out.println(numero[i]);
	            suma += i+1;
		}
		
		   System.out.println("La suma da "+suma);
		   System.out.println("El valor de la media es: "+(suma/numero.length));

	}

}
