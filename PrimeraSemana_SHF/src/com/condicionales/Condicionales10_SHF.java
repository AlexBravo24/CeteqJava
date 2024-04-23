package com.condicionales;

import java.util.Scanner;

public class Condicionales10_SHF {

	public static void main(String[] args) {

//		10.Realiza un programa que pida un número entero entre uno y doce e imprima 
//		el número de días que tiene el mes correspondiente. 
		
		Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero entre 1 y 12:");
        int numeroMes = entrada.nextInt();

        int dias = 0;

        switch (numeroMes) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                dias = 28; 
                break;
            default:
                System.out.println("Número de mes incorrecto. Debe ser un valor entre 1 y 12.");
                break;
        }

        System.out.println("El mes " + numeroMes + " tiene " + dias + " días.");

		
	}

}
