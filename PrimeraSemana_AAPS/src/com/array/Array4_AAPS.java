package com.array;

public class Array4_AAPS {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}. 
		// Guardar los valores de este array en otro array distinto pero con los valores invertidos, 
		// es decir, que el segundo array deberá tener los valores {5,4,3,2,1}.

		int [] posiciones = {1,2,3,4,5};
		int [] arrayinv = new int [posiciones.length];
		
		for (int i = (posiciones.length-1), j = 0 ; i>=0 ; i--, j++) {
			arrayinv [j] = posiciones [i];
			System.out.println(arrayinv[j]);
		}
	}
}
