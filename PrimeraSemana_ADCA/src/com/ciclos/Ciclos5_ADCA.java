package com.ciclos;

///Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
//tendrá al cabo de un año si todo el dinero lo reinvierte?

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
