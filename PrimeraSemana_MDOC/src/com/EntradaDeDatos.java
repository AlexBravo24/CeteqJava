/**
 * 
 */
package com;

import java.util.Scanner; //aqu� se ven las clases que se han importado

/**
 * @author Usuario
 *
 */
public class EntradaDeDatos {

	public static void main(String[] args) {
		
		/* ENTRADA DE DATOS POR TECLADO
		 * utiliza la clase Scanner
		 */
		System.out.println("Introduce un n�mero: ");
		Scanner entrada = new Scanner(System.in); //Scanner es una clase que se debe importar de otro paquete
		int numero; //declaramos la variable vac�a con su tipo
		numero=entrada.nextInt(); //se le asigna el valor de la entrada ya que se ha marcado el tipo de variable anteriormente, por lo que el c�digo sabe lo que espera
		
		System.out.println("usted ingres� el n�mero: " + numero + " Excelente trabajo");
		
		/*OPERADOR DE MODULO
		
		% retorna el residuo
		*/
		

	}

}
