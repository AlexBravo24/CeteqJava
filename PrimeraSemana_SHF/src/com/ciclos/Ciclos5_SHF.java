package com.ciclos;

public class Ciclos5_SHF {

	public static void main(String[] args) {
//
//		5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
//		tendr� al cabo de un a�o si todo el dinero lo reinvierte? 
//		
		double capitalInicial = 1000.00;
		double tasaInteresMensual = 0.02;
		
		double capitalFinal= capitalInicial;
		
		for (int mes = 1; mes <= 12; mes++) {
			capitalFinal *= (1 + tasaInteresMensual);
		}
		
		System.out.println("La cantidad al final del a�o ser� de: " + capitalFinal);
	}

}
