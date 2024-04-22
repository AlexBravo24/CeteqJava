package com.arrays;

public class Arrays2_MOC {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
		//Obtén la suma de todos ellos y la media.
		
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
