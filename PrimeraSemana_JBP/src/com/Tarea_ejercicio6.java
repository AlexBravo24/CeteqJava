//Ejercicio 6 uvas y clases

package com;
import java.util.Scanner;
public class Tarea_ejercicio6 {

	public static void main(String[] args) {
		Scanner uva = new Scanner(System.in);
		
		
		System.out.println("Introduce el precio: ");
		int precio = uva.nextInt();
		
		System.out.println("Introduce tu tipo de uva(uvaA = UvaclaseA y uvaB = UvaclaseB ");
		String tipo = uva.next();
		
		System.out.println("Introduce el tama�o de la uva(1=tama�o1 y 2=tama�o2");
		int tama�o=uva.nextInt();
		
		if(precio<50 && tipo.equals("uvaB") && tama�o==2) { //equals es igual para cadenas de texto
			
			System.out.println("No es v�lido el precio ");
		
		
		}else if(precio<30 && tipo.equals("uvaB")&& tama�o==1) {
			System.out.println("No es v�lido el precio ");
			
		}else if(precio<=0 && tipo.equals("uvaA")&& tama�o==1) {
		    System.out.println("No es v�lido el precio ");
				
			
		}else if(precio<=0 && tipo.equals("uvaA")&& tama�o==2) {
		    System.out.println("No es v�lido el precio ");
				
		}
		
		
		
		if(precio>50 && tipo.equals("uvaB") && tama�o==2) { //equals es igual para cadenas de texto
			int total = precio-50;
			System.out.println("El total a pagar es: "+total);
		
		}else if(precio>30 && tipo.equals("uvaB")&& tama�o==1) {
			int total = precio-30;
			System.out.println("El total a pagar es: "+total);
			
		}else if(precio>0 && tipo.equals("uvaA")&& tama�o==1) {
			int total = precio+20;
			System.out.println("El total a pagar es: "+total);
			
		}else if(precio>0 && tipo.equals("uvaA")&& tama�o==2) {
			int total = precio+30;
			System.out.println("El total a pagar es: "+total);
		}
		
		
		

	}

}
