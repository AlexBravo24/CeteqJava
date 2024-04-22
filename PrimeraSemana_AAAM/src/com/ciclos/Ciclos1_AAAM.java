package com.ciclos;

public class Ciclos1_AAAM {

	public static void main(String[] args) {
		 //Programa un algoritmo que realice la tabla de multiplicar del 12
		
		
		int x = 12;
		int y = 1;
		int Res = 12;
		
		while (Res < 120) {
			Res = x*y;
			System.out.println(Res);
			y++;
		}
		
		
	}

}
