package com.condicionales;

import java.util.Scanner;

public class Condicionales4_MOC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu oración");
		cadena=entrada.nextLine();
		String cadena2=cadena.toLowerCase();
	    
	    if(cadena==cadena2) {
	    	System.out.println("No contiene mayúsculas");
	    }
	    else {
	    System.out.println("Contiene Mayusculas");
	    }
	    
	}

}
