//Ejercicio 8 dado
package com;
import java.util.Scanner;
public class Tarea_ejercicio8 {

	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int cara;
		System.out.println("Ingresa del numero 1 al 6: ");
		cara = dado.nextInt();
		
		switch(cara)
		{
		case 1: System.out.println("SEIS");
		break;
		
		case 2: System.out.println("CINCO");
		break;
		
		case 3: System.out.println("CUATRO");
		break;
		
		case 4: System.out.println("TRES");
		break;
		
		case 5: System.out.println("DOS");
		break;
		
		case 6: System.out.println("UNO");
		break;
		default: System.out.println("ERROR");
		break;
		}
		

	}

}
