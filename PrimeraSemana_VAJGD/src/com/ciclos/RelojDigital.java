package com.ciclos;

public class RelojDigital {

	public static void main(String[] args) {
//		Simular el comportamiento de un reloj digital, imprimiendo la hora,
//		minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
//		horas
		System.out.println("Simulacion de un reloj digital");
		for (int i = 00; i <24; i++) {
			for (int j = 00; j <60; j ++) {
				for (int k = 00; k < 60 ; k++) {
					System.out.println(i +":"+j +":"+k);
					}
				}
			}
		}
		
		
		
		

}


