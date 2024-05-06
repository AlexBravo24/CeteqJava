package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		// LISTAS: son una colecciones de datos o elementos definida como una sucesion de 
		// los mismos. Esta colección se implementa a través de la interface List y por medio
		// de un Array redimensionable de la clase ArrayList. Las listas si adminten valores
		// duplicados, son de las colecciones mas utilizadas y con mejor rendimiento.
		// No podemos guardar tipso de dato primitivo pero si datos de tipo Objeto (String, Wrapper, etc).
		
		// Declarar una lista de elementos de tipo string
//		List <String> lista = new ArrayList <String> ();
		
		// Agregar elementos a nuestra lista
//		lista.add("Adriana"); // Posicion 0
//		lista.add("Carlos"); // Posicion 1
//		lista.add("Sarai"); // Posicion 2
//		lista.add("Alberto"); // Posicion 3
//		lista.add("Gabriela"); //Posicion 4
//		lista.add("Alberto"); // Posicion 5
		
		// Imprimir una lista en consola 
//		System.out.println(lista);
		
		// Imprimir el valor de un solo elemento de la lista
//		System.out.println(lista.get(0));
		
		// Devolver un valor booleano si el elemento existe en la lista
//		System.out.println(lista.contains("Rafael"));
//		System.out.println(lista.contains("Gabriela"));
		
		// Devuelve la posición donde se encuentra al elemento por primera vez
//		System.out.println(lista.indexOf("Alberto"));
		
		// Devuelve la ultima posición donde encuentra al elemento
//		System.out.println(lista.lastIndexOf("Alberto"));
		
		// Eliminar un elemento de mi lista
//		lista.remove("Alberto");
//		System.out.println(lista); // Alberto se repite en la lista y esta función eliminó al primero que encontró
//		lista.remove(3);
//		System.out.println(lista); // Esta eliminp a un Alberto repetido porque le indique la ubicación exacta de este
		
//		// Añadir elementos a la lista, indicando una determinada posición
//		lista.add(2, "Sebastian"); // Se agrega el elmento y desplaza las posiciones, no remplaza el elemento del indice indicado
//		System.out.println(lista);
		
//		// Remplazar el valor de una determinada posicion 
//		lista.set(1, "Edson");
//		System.out.println(lista);

		// Recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva línea
//		for (int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i));
//		}
		
		// Puedo almacenar varios elementos si parametrizo mi lista con elementos Object
		// o si no la parametrizo
		List <Object> coleccion = new ArrayList <Object> ();
		
		coleccion.add("Nombre"); // Cadena o String
		coleccion.add(23); // Entero o integer
		coleccion.add(3.1416); // Decimal o double
		coleccion.add(true); // Booleano
		coleccion.add("$"); // Caracter o chart
		
		// Crear la lista o Array anterior es posible gracias a que lo estoy haciendo con ayuda de la clase Object
		
		System.out.println(coleccion.get(2));
		
		
		
	}

}
