package com.arrays;


public class Arrays4_ADCA {
	/*Dado un array de números de 5 posiciones con los siguientes valores: 
	{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
	los valores invertidos, es decir, que el segundo array deberá tener los valores 
	{5,4,3,2,1}.*/
	static void reversa(int[] numeros) {
		
		int i = 0;
		int j = numeros.length - 1;
		while(i<j) {
			int t = numeros[i];
			numeros[i] = numeros[j];
			numeros[j] = t;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		int[] numeros = {1,2,3,4,5};
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		reversa(numeros);
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
			
		}
	}

}
