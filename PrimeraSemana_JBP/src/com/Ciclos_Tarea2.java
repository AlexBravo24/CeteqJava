//Programa un algoritmo que realice la tabla de multiplicar de un numero
//introducido desde teclado, hasta la iteración deseada por el usuario.
//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???


package com;
import java.util.Scanner;
public class Ciclos_Tarea2 {

	public static void main(String[] args) {
		Scanner multi = new Scanner(System.in);
		System.out.println("--------TABLAS DE MULTIPLICAR---------");
		System.out.println("Digite un numero");
		int num= multi.nextInt();
		
		for(int i=1; i<=95; i++)
			System.out.println(num+"*"+i+"="+(num*i));

	}

}
