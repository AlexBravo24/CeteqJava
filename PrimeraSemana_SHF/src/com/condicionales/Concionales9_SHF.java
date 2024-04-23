package com.condicionales;

import java.util.Scanner;

public class Concionales9_SHF {

	public static void main(String[] args) {
//		9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
//		correspondiente. Si introducimos otro número nos da un error. 
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese el numero del dia de la semana (1 - 7): ");
		int numero = entrada.nextInt();
		
		String dia;
		
		switch (numero) {
		case 1: 
			dia= "Lunes";
			break;
			
		case 2: 
			dia= "Martes";
			break;
			
		case 3: 
			dia= "Miercoles";
			break;
		
		case 4: 
			dia= "Jueves";
			break;
			
		case 5: 
			dia= "Viernes";
			break;
		
		case 6: 
			dia= "Sabado";
			break;
			
		case 7: 
			dia= "Domingo";
			break;
			
		default:
			dia = "ERROR: numero incorrecto";
			break;
		}
		
		System.out.println("El número: " + numero + ", corresponde al dia: " + dia);
		
	}

}
