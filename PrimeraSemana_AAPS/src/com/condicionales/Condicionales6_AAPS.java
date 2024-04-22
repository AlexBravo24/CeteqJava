package com.condicionales;

import java.util.Scanner;

public class Condicionales6_AAPS {
	public static void main(String[] args) {
		// La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, 
		// la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, 
		// ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega 
		// en un embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 céntimos al precio inicial 
		// cuando es de tamaño 1 y 30 céntimos si es de tamaño 2. * Si es de tipo B, se rebajan 30 céntimos 
		// cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado.
	Scanner entrada = new Scanner (System.in);
	
	String a = "A";
	String b = "B";
	String tipo;
	
	int tamaño1 = 1;
	int tamaño2 = 2;
	int tamaño;
	
	double precioIn;
	double precioFi;
	
	System.out.print("Ingresa el precio indical por kilo de uva: ");
	precioIn=entrada.nextDouble();
	
	System.out.println("Indica si la uva es de tipo A o B: ");
	tipo=entrada.next();
	
	System.out.println("Indica si la uva es de tamaño 1 o 2: ");
	tamaño=entrada.nextInt();
	
	if (tipo.equalsIgnoreCase(a) && tamaño==tamaño1) {
		precioFi = precioIn + 0.20; 
		System.out.println("El precio por kilo de uva será de: " + precioFi);
		
	} else if (tipo.equalsIgnoreCase(a) && tamaño==tamaño2) {
		precioFi = precioIn + 0.30;
		System.out.println("El precio por kilo de uva será de: " + precioFi);
		
	} else if (tipo.equalsIgnoreCase(b) && tamaño==tamaño1) {
		precioFi = precioIn + 0.30;
		System.out.println("El precio por kilo de uva será de: " + precioFi);
		
	} else if (tipo.equalsIgnoreCase(b) && tamaño==tamaño2) {
		precioFi = precioIn + 0.50;
		System.out.println("El precio por kilo de uva será de: " + precioFi);
		}
	}
}
