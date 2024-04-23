package Arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arrays1_TMPE {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponda
	


		//Declarando un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner(System.in);
		
		int [] números2 = new int [10];
		
	    		
				
	for (int i = 0; i < números2.length; i++) {
	System.out.println("Ingresa un número en la posición " + i);
   	números2[i]=input.nextInt();	}
		input.close();
	
		
		for (int i = 0; i < números2.length; i++) {
		System.out.print(números2[i]+ ",");		
	}
	
	
	
	}
	
	
}


