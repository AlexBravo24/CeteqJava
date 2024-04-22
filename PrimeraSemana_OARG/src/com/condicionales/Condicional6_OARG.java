package com.condicionales;

import java.util.Scanner;

public class Condicional6_OARG {

	public static void main(String[] args) {
//		La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
//		de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
//		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se
//		requiere determinar cu�nto recibir� un productor por la uva que entrega en un
//		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
//		c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de
//		tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y
//		50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado

		Scanner cadena=new Scanner(System.in);
		
		String a="a";
		String b="b";
		String tipo;
		int tama�o1=1;
		int  tama�o2=2;
		int tama�o;
		double precioI;
		double precioF;
		
		
		System.out.println("Este programa calcula cu�nto recibir� un productor por la uva que entrega en un embarque considerando lo siguiente:  ");
	
	    System.out.println("Ingresa el precio Inicial por kilo de uva: ");
	    precioI=cadena.nextDouble();
	    
	    System.out.println("La uva es de tipo A o B");
	    tipo=cadena.next();
	    
	    System.out.println("La uva es de tama�o 1 o 2");
	    tama�o=cadena.nextInt();
	    
	    if(!(tipo.equalsIgnoreCase(a)) || !(tipo.equalsIgnoreCase(b))) {
	    	System.out.println("vuelve a mandar tus datos");
	    	
	    }else if (tama�o>tama�o1 || tama�o > tama�o2 || tama�o<tama�o1 || tama�o<tama�o2) {
	    	System.out.println("vuelve a mandar tus datos");
	     
	    
	    }else if (tipo.equalsIgnoreCase(a) && tama�o==tama�o1) {
	    	precioF=precioI+0.20;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF);
	    	
	    }else if(tipo.equalsIgnoreCase(a) && tama�o==tama�o2) {
	    	precioF=precioI+0.30;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF); 
	    }else if(tipo.equalsIgnoreCase(b) && tama�o==tama�o1) {
	    	precioF=precioI-0.30;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF); 
	    }else if(tipo.equalsIgnoreCase(b) && tama�o==tama�o2) {
	    	precioF=precioI-0.50;
	    	
	    	System.out.println("El precio por kilo de uva va a ser de: "+precioF); 
	    }
	
	}//FINAL MAIN

}//FINAL CLASE
