package Ciclos;

import java.util.Scanner;

public class Ciclos3_TMPE {
	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo.

String original;
String reversa = "";

//Declaro un Scanner para ingresar los valores por teclado

Scanner entrada = new Scanner(System.in);
//Solicito que se ingrese la información
System.out.println("Escriba una oración");
original = entrada.nextLine();

//Vamos a armar nuestro palíndromo 
for (int i = original.length()-1; i>=0; i--) {
	reversa = reversa + original.charAt(i); //E + l + b + e + b + é
	
	System.out.println(original);
	System.out.println(reversa);
	
	//Compararlas con .equals
	
	if(original.equalsIgnoreCase(reversa)) {
        System.out.println("Es palindromo");
    	}else {
        System.out.println("No es palindromo");
    	}
    	
	
	
	
	
}








}
}
