package Ciclos;

import java.util.Scanner;

public class Ciclos2_TMPE {

	public static void main(String[] args) {
		// 2.-Programa un algoritmo que realice la tabla de multiplicar 
		//de un numero introducido desde teclado, hasta la iteración deseada
		//por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

	
		Scanner entrada = new Scanner (System.in);
		
		
				int tabla; 
				System.out.println("Introduce un número");
				tabla=entrada.nextInt(); 
	  
	    tabla_de_multiplicar(tabla);
	}

	public static void tabla_de_multiplicar(int tabla) {
	    for (int a = 1; a <= 95; a++) {
	        String formato = "%d x %d = %d";
	        String linea = String.format(formato,tabla, a, tabla * a);
	        System.out.println(linea);
	    }
	
	


	
		}
	
	}

