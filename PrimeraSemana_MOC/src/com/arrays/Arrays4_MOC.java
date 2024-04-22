package com.arrays;

public class Arrays4_MOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros1= {1,2,3,4,5};
		int[] numeros2= new int [5];
		//System.out.println(numeros1.length);
		for (int i=0, j = numeros1.length-1; j>=0; i++,j--) {
			numeros2[i]=numeros1[j];
			
		}
		for(int i:numeros2) {
			System.out.print(i+" ");
		}
		
	}

}
