package com;

public class Arrays {

	public static void main(String[] args) {
		// Los arrays son una estructura que nos permite
				// almacenar una cantidad de elementos
				// de un tipo de datos en común
				// Una de las desventajas de los arrays es que estos
				// no pueden crecer en tiempo de ejecución

				// Ejemplo de declaración de un array de números enteros
				// sin tamaño asignado ni valores
				int[] numeros;

				// Ejemplo de declaracion de un array con tamaño iniciado
				int[] numeros2 = new int[6];

				// Los arrays comienzan a almacenar valores desde
				// la posicion "0", por lo cual la ultima posicion
				// a almacenar en este ejemplo es la "4".

				numeros2[0] = 101;
				numeros2[1] = 102;
				numeros2[2] = 103;
				numeros2[3] = 104;
				numeros2[4] = 105;
				numeros2[5] = 106;
				// Ejemplo de mostrar o mandar a imprimir una determinada posicion
				// en consola
				System.out.println(numeros2[5]);

				// Ejemplo de declarar un array de numeros enteros
				// pero con sus valores asignados desde un inicio

				int[] numeros3 = { 101, 102, 103, 104, 105, 106 };

				// Ejemplos de otros array de otro tipo de datos

				char[] letras = { 'A', 'L', 'E', 'X', ' ' };

				String[] nombres = { "Nadia", "Sebastian", "Brandon" };

				// Ejemplo de recorre un array con un ciclo for

				for (int i = 0; i < nombres.length; i++) {
					System.out.println(i + ".- " + nombres[i]);
				}

		//¿CÓMO PUEDO TENER UN ARRAY QUE ME PERMITA ALMACENAR
		//DATOS DE TIPO ENTERO, DECIMALES, CARACTERES, CADENAS DE TEXTO
		//, ETC, EN UN MISMO ARRAY?
				
		//Podemos tener un array de elementos de tipo Objeto
				//y así almacenar esta "supuesta" de diferentes tipos
				//de dato
				
			Object texto = "Texto";
			Object entero = 1001;
			
		Object [] mezcladito = {1, 3,1416, "Alex", 'A', true};	
				
			//double resultado = mezcladito[0] + mezcladito[1];

	}

}
