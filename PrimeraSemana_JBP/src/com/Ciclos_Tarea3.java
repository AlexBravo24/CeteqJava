//Realiza un programa para determinar si un String es palíndromo.

package com;
import java.util.Scanner;
public class Ciclos_Tarea3 {

	public static void main(String[] args) {
		Scanner palindromo = new Scanner(System.in);
		
		System.out.println("Introduce tu palabra");
		String palabra= palindromo.next();
		
		char arreglo[]= palabra.toCharArray();//metodo toCharArray convierte un tipo string en un arreglo de tipo char
//		
		char pali[]= new char[palabra.length()];  
		
		int j= 0;
		for(int i=palabra.length()-1; i>=0; i--) {
			 
			
			pali[j]=arreglo[i];
			j++;
		}
		
		String respuesta = new String(pali);
		System.out.println(respuesta);
//		
		if(palabra.equals(respuesta)) {
			System.out.println("Esta palabra es palindroma");
		}else {
			System.out.println("No es palindroma");
		}

	}

}
