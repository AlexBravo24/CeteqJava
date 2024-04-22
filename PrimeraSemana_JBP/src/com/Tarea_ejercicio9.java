//Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
//correspondiente. Si introducimos otro número nos da un error


package com;
import java.util.Scanner;
public class Tarea_ejercicio9 {

	public static void main(String[] args) {
		Scanner ingresar = new Scanner(System.in);
		
		int dia;
		System.out.println("Ingresa un numero que sea entre 1 y 7: ");
		dia = ingresar.nextInt();
		
		switch(dia)
		{
		case 1: System.out.println("Lunes");
		break;
		
		case 2: System.out.println("Martes");
		break;
		
		case 3: System.out.println("Miercoles");
		break;
		
		case 4: System.out.println("Jueves");
		break;
		
		case 5: System.out.println("Viernes");
		break;
		
		case 6: System.out.println("Sabado");
		break;
		
		case 7: System.out.println("Domingo");
		break;
		default: System.out.println("ERROR");
		break;
		}
			
		
		

		
		
			
	}

}
