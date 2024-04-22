package com;
import java.util.Scanner;
public class Tarea_Array1 {

	public static void main(String[] args) {
		
		
		int [] num  = new int [10];
		Scanner input = new Scanner(System.in);
		int [] numeros2  = new int [10];
		System.out.println("Ingrese un número ");
		for (int i =  0; i<numeros2.length; i++) {
			
			numeros2 [i] = input.nextInt();
		}
		
		for (int i =  0; i<numeros2.length; i++) {
			
			System.out.println("En la posición " +i+ " Está el número "+numeros2[i]);
		}
		
		
		

	}

}
