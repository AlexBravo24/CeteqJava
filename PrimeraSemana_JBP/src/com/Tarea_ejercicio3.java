//Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el segundo número es 0, 
//debe mostrar un mensaje de error

package com;
import java.util.Scanner;
public class Tarea_ejercicio3 {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
		
		int numero1;
		System.out.println("Introduce un número");
    	numero1 = entrada .nextInt();
    	
    	System.out.println("Introduce otro número");
		int numero2 = entrada .nextInt();
		
		if(numero2==0) {
			System.out.println("Esto es un error");
		}else {
			int numero3 = numero1/numero2;
			System.out.println("La división de los dos números es: " +numero3);
		
		
		}

	}

}
