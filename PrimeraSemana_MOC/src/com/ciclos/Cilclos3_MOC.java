package com.ciclos;

import java.util.Scanner;

public class Cilclos3_MOC {
public static void main(String[] args) {
	Scanner entrada=new Scanner (System.in);
	System.out.println("Ingresa la palabra de tu interes: ");
	String palabra=entrada.nextLine();
	int num=palabra.length();
	String palabra2;
	boolean r = true;
	for(int i = 0, j=num-1; i<=j; i++, j--) {
		if(palabra.charAt(i)!=palabra.charAt(j)) {
			
			r=false;
			break;
			
									}
		}
	if(r==true) {
		System.out.println("Es palindromo");
	}
	else{
		System.out.println("No es palindromo");
	}
	
}
}

