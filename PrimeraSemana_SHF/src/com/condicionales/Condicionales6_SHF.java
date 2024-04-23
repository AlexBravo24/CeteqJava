package com.condicionales;

import java.util.Scanner;

public class Condicionales6_SHF {

	public static void main(String[] args) {
		
//		6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo 
//		de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se 
//		requiere determinar cuánto recibirá un productor por la uva que entrega en un 
//		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
//		céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de 
//		tamaño 2. * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 
//		50 céntimos cuando es de tamaño 2. Precio inicial se recibe desde teclado 

		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio por kilo de uva:");
        double precioInicial = scanner.nextDouble();

        System.out.println("Ingrese el tipo de uva (A o B):");
        char tipoUva = scanner.next().charAt(0);

        System.out.println("Ingrese el tamaño de la uva (1 o 2):");
        int tamañoUva = scanner.nextInt();

        double precioFinal = 0;

        if (tipoUva == 'A') {
            if (tamañoUva == 1) {
                precioFinal = precioInicial + 0.20;
            } else if (tamañoUva == 2) {
                precioFinal = precioInicial + 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamañoUva == 1) {
                precioFinal = precioInicial - 0.30;
            } else if (tamañoUva == 2) {
                precioFinal = precioInicial - 0.50;
            }
        }

        System.out.println("El precio final por kilo de uva es: " + precioFinal + " euros");

	}

}
