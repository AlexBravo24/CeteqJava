package com;

public class Ciclos_Tarea5 {

	public static void main(String[] args) {
		int x= 0;
		double moni=1000;
		
		while(x<12) {
			double interes = moni*0.2; //double es para el tipo de dato que tiene decimal-no numero entero
			moni=moni+interes;
			x++;//acumulador para ir sumando de uno en uno
			
		}
		
		System.out.println("El total es: "+moni);
		

	}

}
