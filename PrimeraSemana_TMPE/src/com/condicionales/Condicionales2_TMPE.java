package com.condicionales;

import java.util.Scanner;

public class Condicionales2_TMPE {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un n�mero por teclado 
				//y nos indique si es par o impar.
		        
				Scanner teclado = new Scanner (System.in);
				
				int a;
		        System.out.print("Ingresa un n�mero por teclado " );	
		        a = teclado.nextInt();
		        
		        if(a % 2 == 0) {
		        	System.out.println(a + " Es un n�mero par. ");
		        	}else {
		        		System.out.println(a + " No es un n�mero par. ");
		        	}
		        

	}

}
