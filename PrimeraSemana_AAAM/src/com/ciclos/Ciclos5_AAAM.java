package com.ciclos;

import java.util.Scanner;

public class Ciclos5_AAAM {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		// de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		// tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		double inv;
		double interes;
	    int meses =1;
	
		
		
		System.out.println("Ingrese el monto mensual a invertir en el banco");
		Scanner entrada = new Scanner(System.in);
		inv = entrada.nextDouble();
	
		System.out.println("Ingrese el interes mensual otorgado como valores decimales, \nejemplo: \n2% = .02 \n20% = .20");
		interes = entrada.nextDouble();
		
		System.out.println("¿A cuantos meses desea calcular su ganancia?");
		meses = entrada.nextInt();
		
				
		for (int i = 1; i<= meses; i++) {
			inv= inv + inv*interes;

			
		}
		System.out.print("Las cantidad a ganar en " + meses + " meses, es: ");
		System.out.printf("%.2f", inv);
		
	}

}
