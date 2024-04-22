package com.ciclos;

import java.util.Scanner;

public class Ciclos3_MDOC {
	
	public static void main(String[] args) {
		System.out.println("Este programa determina si la palabra ingresada es un palindromo \r\n"
				+ "A continuación escribe la palabra que deseas verificar:");
		
		Scanner u=new Scanner(System.in);
		
		String frase = u.nextLine();
		u.close();
		
		String invertida = "";
		
		for (int indice = frase.length() - 1; indice >= 0; indice--) {
			invertida += frase.charAt(indice);
		}		
		
		if (frase.replace(" ", "").equalsIgnoreCase(invertida.replace(" ", ""))){
			System.out.println(frase + " es un palindromo");
		} else {
			System.out.println(frase + " no es un palindromo");
		}
		


		
		

	}

}
