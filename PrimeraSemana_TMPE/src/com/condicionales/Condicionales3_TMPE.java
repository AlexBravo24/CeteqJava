package com.condicionales;

import java.util.Scanner;
public class Condicionales3_TMPE {
public static void main(String[] args) {

         //3.Crea un programa que pida al usuario dos n�meros 
         //y muestre el resultado de su divisi�n.
         //Si el segundo n�mero es 0, debe mostrar un mensaje de error.

        Scanner entrada = new Scanner (System.in);;
        
        int a; 
		System.out.println("Introduce el primer n�mero");
		a =entrada.nextInt(); 
		
		System.out.println("Introduce el segundo numero");
	    int b = entrada.nextInt(); 
	
	 if (b !=0 ) { 
    	   System.out.println((double)a / (double)b);
       }else {
       System.out.println("Error");
       
   		
       }

		
}

}        