package com.condicionales;

import java.util.Scanner;

public class Condicionales2_TMPE {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado 
				//y nos indique si es par o impar.
		        
				Scanner teclado = new Scanner (System.in);
				
				int a;
		        System.out.print("Ingresa un número por teclado " );	
		        a = teclado.nextInt();
		        
		        if(a % 2 == 0) {
		        	System.out.println(a + " Es un número par. ");
		        	}else {
		        		System.out.println(a + " No es un número par. ");
		        	}
		        

	}

}
