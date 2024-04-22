package com.ciclos;

public class Ciclos4_EDB {

	public static void main(String[] args) {
		
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos 
		//y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas

		for (int hora=0; hora <= 23; hora++)
		for (int min=0; min <= 59; min++)
		for (int seg=0; seg <= 59; seg++)
		System.out.println(hora +"h "+ min  +"m "+ seg+"s");
		
		
		
		
		
		
	}

}
