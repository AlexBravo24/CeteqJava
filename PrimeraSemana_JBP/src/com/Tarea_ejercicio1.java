//.Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales

package com;
import java.util.Scanner;
public class Tarea_ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		System.out.println("Introduce un n�mero");
    	numero1 = entrada .nextInt();
    	
    	System.out.println("Introduce otro n�mero");
		int numero2 = entrada .nextInt();
		
		if (numero1>numero2) {
			System.out.println(numero1+"es mayor que "+numero2);
			
		}else {
			System.out.println(numero2+"es mayor que"+numero1);
		}
		if (numero1==numero2) {
			System.out.println("Son iguales");
		}
     
	}

}
