package com.condicionales;

import java.util.Scanner;

public class Condicionales8_SHF {

	public static void main(String[] args) {

		 Scanner entrada = new Scanner(System.in);

	        System.out.println("Ingrese el resultado obtenido al lanzar un dado de seis caras:");
	        int resultado = entrada.nextInt();

	        String caraOpuesta;

	        switch (resultado) {
	            case 1:
	                caraOpuesta = "Seis";
	                break;
	            case 2:
	                caraOpuesta = "Cinco";
	                break;
	            case 3:
	                caraOpuesta = "Cuatro";
	                break;
	            case 4:
	                caraOpuesta = "Tres";
	                break;
	            case 5:
	                caraOpuesta = "Dos";
	                break;
	            case 6:
	                caraOpuesta = "Uno";
	                break;
	            default:
	                caraOpuesta = "ERROR: número incorrecto";
	                break;
	        }

	        System.out.println("La cara opuesta al número " + resultado + " es: " + caraOpuesta);

	}

}
