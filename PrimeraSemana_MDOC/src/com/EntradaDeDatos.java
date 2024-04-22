/**
 * 
 */
package com;

import java.util.Scanner; //aquí se ven las clases que se han importado

/**
 * @author Usuario
 *
 */
public class EntradaDeDatos {

	public static void main(String[] args) {
		
		/* ENTRADA DE DATOS POR TECLADO
		 * utiliza la clase Scanner
		 */
		System.out.println("Introduce un número: ");
		Scanner entrada = new Scanner(System.in); //Scanner es una clase que se debe importar de otro paquete
		int numero; //declaramos la variable vacía con su tipo
		numero=entrada.nextInt(); //se le asigna el valor de la entrada ya que se ha marcado el tipo de variable anteriormente, por lo que el código sabe lo que espera
		
		System.out.println("usted ingresó el número: " + numero + " Excelente trabajo");
		
		/*OPERADOR DE MODULO
		
		% retorna el residuo
		*/
		

	}

}
