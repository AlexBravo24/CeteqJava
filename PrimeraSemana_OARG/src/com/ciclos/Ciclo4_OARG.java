package com.ciclos;

public class Ciclo4_OARG {

	public static void main(String[] args) throws InterruptedException {
//      Simular el comportamiento de un reloj digital, imprimiendo la hora,
//		minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
//		horas
       //Declarar variables
       int horas=0;
       int minutos=0;
       int segundos=0;
		
		while(true) { //Se pone utiliza while (true) porque no tiene una condición de salida (ES INFINITO)
			
			//MOSTRAR
			
			if (horas<10) {
				System.out.print("0");
			}
			System.out.print(horas+":");
			
			if (minutos<10) {
				System.out.print("0");
			}
			System.out.print(minutos+":");
			
			if (segundos<10) {
				System.out.print("0");
			}
			System.out.println(segundos);
			
			//Aumentar el tiempo
			segundos++;
			
			//Comprobar el tiempo 
			if (segundos==60) {
				segundos=0;
				minutos++;
				
				if (minutos==60) {
					minutos=0;
					horas++;
					
					if (horas==24) {
						horas=0;
					}
				}
				
			}
			
			Thread.sleep(1000); //Clase para poder esperar 1 segundo 
			
		}
		
			
	}

}
