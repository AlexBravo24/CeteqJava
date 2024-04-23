package com.ciclos;

public class Ciclos1_SHF {

	public static void main(String[] args) {
//		1.- Programa un algoritmo que realice la tabla de multiplicar del 12 

		int multiplicador = 12;
		
		System.out.println("Tabla de multiplicar del " + multiplicador + ":");
		
		for(int i=0; i <= 10; i++) {
			int resultado = multiplicador * i;
			System.out.println(multiplicador + " x " +  i +" = " + resultado);
		}
	}

}
