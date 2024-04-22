package com.ciclos;

public class Ciclos5_MOC {

	public static void main(String[] args) {
	float inversionin=1000;
	float interes=0.02F;
		
	for(int i=1; i <= 12; i++) {
		inversionin=(inversionin+(inversionin*interes));
		if(i==12) {
		System.out.println("La cantidad de dinero al invertir $1000 en el banco con 2% de interes mensual es: $"+inversionin);
		}
	}


	}

}
