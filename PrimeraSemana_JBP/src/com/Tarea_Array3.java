package com;
import java.util.Scanner;
public class Tarea_Array3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa tu frase");
		String frase = input.next();
		
		char arreglo[] = frase.toCharArray();
		
        for (int i =  0; i<arreglo.length; i++) {
			
			System.out.println("En la posici�n " +i+ " Est� el n�mero "+arreglo[i]);
		}
		
		

	}

}
