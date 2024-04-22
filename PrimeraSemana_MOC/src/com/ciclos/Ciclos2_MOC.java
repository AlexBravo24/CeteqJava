package com.ciclos;

import java.util.Scanner;

public class Ciclos2_MOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner (System.in);
		System.out.println("Ingresa el número del que deseas obtener la tabla de multiplicar");
		int x=entrada.nextInt();
		System.out.println("Ingresa el número de iteraciones deseadas");
		int y=entrada.nextInt();
		
		for(int i = 1; i<=y; i++) {
			System.out.println(x + " x " + i + " = " + (x*i));
			
		}
	}

}
