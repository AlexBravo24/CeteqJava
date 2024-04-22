package com.arrays;

public class Array4_OARG {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores:
		// {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		// los valores invertidos, es decir, que el segundo array deberá tener los valores
		// {5,4,3,2,1}.
		
		int [] numeros = {1,2,3,4,5};
		
		int []numeros2 =new int [5];
		
		for (int i = (5-1),j=0; i>=0;i--,j++) {
			numeros2[j]=numeros[i];
			
			System.out.print(numeros2[j]+" ");
			
		}
		
		
		

	}

}
