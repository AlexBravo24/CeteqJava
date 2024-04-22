package com.ciclos;

public class Ciclos5_AAPS {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga 
		// un 2% de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		// tendrá al cabo de un año si todo el dinero lo reinvierte?

		double inv = 1000;
		int mes = 0;
		
		while (mes <= 11) {
			inv = inv*1.02;
			mes++;
			System.out.println("El capital en el mes "+ mes + " será de $"+ inv);
		}
	}

}
