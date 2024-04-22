package com.ciclos;

public class Ciclos4_MDOC {

	public static void main(String[] args) {
		System.out.println("Simular el comportamiento de un reloj digital, imprimiendo la hora, \r\n" + 
				"minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 \r\n" + 
				"horas ");
		
		
		for(int h=00; h<24;h++) {
			for(int m=00; m<60;m++) {
				for(int s =00; s<60; s++) {
//					System.out.println(h+":"+m+":"+s);
					System.out.printf("%02d:%02d:%02d%n", h, m, s);
				}
			}
		}
		
		
		



	}

}
