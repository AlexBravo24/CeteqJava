package com.condicionales;

import java.util.Scanner;

public class Condicionales1_TMPE {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos n�meros 
		//por teclado e indique cu�l es mayor o si son iguales.

		
		Scanner entrada = new Scanner (System.in);

        int a;
        int b;
        
      System.out.println("Ingresa el primer n�mero");
      a = entrada.nextInt(); 
      
      System.out.println("Ingresa el segundo n�mero");
      b = entrada.nextInt();
      
      if (a>=b) { // Si (esto es verdad) { ejecuta lo siguiente
			System.out.println("S�");
		}else { //De otro modo, ejecuta lo siguiente
			System.out.println("No");
		}

	
	
}
}