//Programa un algoritmo que realice la tabla de multiplicar del 12

package com;
import java.util.Scanner;
public class Ciclos_Tarea1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--------TABLA DE MULTIPLICAR 12---------");
		System.out.println("Digite un numero");
		int num= entrada.nextInt();
		
		for(int i=1; i<=12; i++)
			System.out.println(num+"*"+i+"="+(num*i));

	}

}
