package com.condicionales;

import java.util.Scanner;

public class Condicionales6_MDOC {

	public static void main(String[] args) {
		
		System.out.println("Hola! �ste programa sirve para determinar cu�nto recibir�   \r\n" + 
				"un productor por la uva que entrega en un embarque. ");
		
		Scanner pi = new Scanner(System.in);
		
		int cs;
		int kg;
		
		System.out.println("Para comenzar ingresa el precio inicial del kilo de uva:");
		cs = pi.nextInt();
				
		System.out.println("Ahora ingresa la cantidad de kg que vender� el productor:");
		kg = pi.nextInt();
		
		float a1 = (cs + .20f)*kg;
		float a2 = (cs + .30f)*kg;
		float b1 = (cs - .30f)*kg;
		float b2 = (cs - .50f)*kg;
		
		System.out.println("Para " + kg + "Kg de uva, el productor recibir�: \r\n" +
				"Para el tipo A, tama�o 1 : $" + a1 + "\r\n" +
				"Para el tipo A, tama�o 2 : $" + a2 + "\r\n" +
				"Para el tipo B, tama�o 1 : $" + b1 + "\r\n" +
				"Para el tipo B, tama�o 2 : $" + b2 + "\r\n" );
		
		

	}

}
