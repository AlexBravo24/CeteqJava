package com.ciclos;

///Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
//tendr� al cabo de un a�o si todo el dinero lo reinvierte?

public class Ciclos5_ADCA {
	public static void main(String[] args) {
		int i = 0;
		int saldoInicial = 1000;
		while(i < 12) {
			saldoInicial += (saldoInicial * .02);
			i++;
			System.out.println("Mes " + i + " - " + saldoInicial);
		}
		
	}

}
