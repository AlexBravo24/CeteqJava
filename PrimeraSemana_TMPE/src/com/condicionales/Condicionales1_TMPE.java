package com.condicionales;

import java.util.Scanner;

public class Condicionales1_TMPE {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números 
		//por teclado e indique cuál es mayor o si son iguales.

		
		Scanner entrada = new Scanner (System.in);

        int a;
        int b;
        
      System.out.println("Ingresa el primer número");
      a = entrada.nextInt(); 
      
      System.out.println("Ingresa el segundo número");
      b = entrada.nextInt();
      
      if (a>=b) { // Si (esto es verdad) { ejecuta lo siguiente
			System.out.println("Sí");
		}else { //De otro modo, ejecuta lo siguiente
			System.out.println("No");
		}

	
	
}
}