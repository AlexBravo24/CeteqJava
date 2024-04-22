package com.condicionales;

import java.util.Scanner;

public class Condicional6_OARG {

	public static void main(String[] args) {
//		La asociación de vinicultores tiene como política fijar un precio inicial al kilo
//		de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2).
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se
//		requiere determinar cuánto recibirá un productor por la uva que entrega en un
//		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
//		céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de
//		tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y
//		50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado

		Scanner cadena=new Scanner(System.in);
		
		String a="a";
		String b="b";
		String tipo;
		int tamaño1=1;
		int  tamaño2=2;
		int tamaño;
		double precioI;
		double precioF;
		
		
		System.out.println("Este programa calcula cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:  ");
	
	    System.out.println("Ingresa el precio Inicial por kilo de uva: ");
	    precioI=cadena.nextDouble();
	    
	    System.out.println("La uva es de tipo A o B");
	    tipo=cadena.next();
	    
	    System.out.println("La uva es de tamaño 1 o 2");
	    tamaño=cadena.nextInt();
	    
	    if(!(tipo.equalsIgnoreCase(a)) || !(tipo.equalsIgnoreCase(b))) {
	    	System.out.println("vuelve a mandar tus datos");
	    	
	    }else if (tamaño>tamaño1 || tamaño > tamaño2 || tamaño<tamaño1 || tamaño<tamaño2) {
	    	System.out.println("vuelve a mandar tus datos");
	     
	    
	    }else if (tipo.equalsIgnoreCase(a) && tamaño==tamaño1) {
	    	precioF=precioI+0.20;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF);
	    	
	    }else if(tipo.equalsIgnoreCase(a) && tamaño==tamaño2) {
	    	precioF=precioI+0.30;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF); 
	    }else if(tipo.equalsIgnoreCase(b) && tamaño==tamaño1) {
	    	precioF=precioI-0.30;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF); 
	    }else if(tipo.equalsIgnoreCase(b) && tamaño==tamaño2) {
	    	precioF=precioI-0.50;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF); 
	    }
	
	}//FINAL MAIN

}//FINAL CLASE
