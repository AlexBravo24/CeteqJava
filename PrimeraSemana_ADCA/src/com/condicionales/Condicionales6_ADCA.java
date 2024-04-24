package com.condicionales;

import java.util.Scanner;

public class Condicionales6_ADCA {

	public static void main(String[] args) {
		/* La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial 
		 * al kilo
de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). 
Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se 
requiere determinar cu�nto recibir� un productor por la uva que entrega en un 
embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20 
c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de 
tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 
50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado */
		int precioInicial;
		char tipoDeUva;
		char grapeSize;//aqui puse la variable en ingles para evitar unar la letra "�"
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indique el precio inicial ");
		precioInicial = entrada.nextInt();
		System.out.println("Indique el tipo de uva (A) � (B) ");
		tipoDeUva = entrada.next().charAt(0);
		System.out.println("Indique el tama�o de la uva");
		grapeSize = entrada.next().charAt(0);
		
		if(tipoDeUva == 'A' && grapeSize == '1') {
			precioInicial += 20;
			System.out.println(precioInicial);
		}else if(tipoDeUva == 'A' && grapeSize == '2'){
			precioInicial += 30;
			System.out.println(precioInicial);
		}else if(tipoDeUva == 'B' && grapeSize == '1') {
			precioInicial -= 30;
			System.out.println(precioInicial);
		}else if(tipoDeUva == 'B' && grapeSize == '2') {
			precioInicial -= 50;
			System.out.println(precioInicial);
		}else{
			System.out.println("Hubo algun error");
		}
			
	}

}
