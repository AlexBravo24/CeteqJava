package com.ciclos;

public class Ciclos5_AAPS {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga 
		// un 2% de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
		// tendr� al cabo de un a�o si todo el dinero lo reinvierte?

		double inv = 1000;
		int mes = 0;
		
		while (mes <= 11) {
			inv = inv*1.02;
			mes++;
			System.out.println("El capital en el mes "+ mes + " ser� de $"+ inv);
		}
	}

}
