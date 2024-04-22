package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AAPS {
	public static void main(String[] args) {
		// La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, 
		// la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, 
		// �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que entrega 
		// en un embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial 
		// cuando es de tama�o 1 y 30 c�ntimos si es de tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos 
		// cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado.
	Scanner entrada = new Scanner (System.in);
	
	String a = "A";
	String b = "B";
	String tipo;
	
	int tama�o1 = 1;
	int tama�o2 = 2;
	int tama�o;
	
	double precioIn;
	double precioFi;
	
	System.out.print("Ingresa el precio indical por kilo de uva: ");
	precioIn=entrada.nextDouble();
	
	System.out.println("Indica si la uva es de tipo A o B: ");
	tipo=entrada.next();
	
	System.out.println("Indica si la uva es de tama�o 1 o 2: ");
	tama�o=entrada.nextInt();
	
	if (tipo.equalsIgnoreCase(a) && tama�o==tama�o1) {
		precioFi = precioIn + 0.20; 
		System.out.println("El precio por kilo de uva ser� de: " + precioFi);
		
	} else if (tipo.equalsIgnoreCase(a) && tama�o==tama�o2) {
		precioFi = precioIn + 0.30;
		System.out.println("El precio por kilo de uva ser� de: " + precioFi);
		
	} else if (tipo.equalsIgnoreCase(b) && tama�o==tama�o1) {
		precioFi = precioIn + 0.30;
		System.out.println("El precio por kilo de uva ser� de: " + precioFi);
		
	} else if (tipo.equalsIgnoreCase(b) && tama�o==tama�o2) {
		precioFi = precioIn + 0.50;
		System.out.println("El precio por kilo de uva ser� de: " + precioFi);
		}
	}
}
