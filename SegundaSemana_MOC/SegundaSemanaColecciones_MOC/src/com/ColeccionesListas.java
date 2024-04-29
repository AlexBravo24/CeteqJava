package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas- Son una coleccion de datos o elementos definidas
		//como una sucesion de los mismos
		//esta coleccion se implementa a traves de una interfaz lista
		//y por medio de un array redimensionable de la clase ArrayList
		//las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mejor rendimiento
		//NO PODEMOS GUARDAR TIPOS DE DATO PRIMITIVO
		//Per si datos de tipo objeto (String, Wrapper,etc)
		
		//Declarar una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>();
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Majo");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gaby");
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(3));
		
		//Devuelva un valor boolenado si el elemento existe en la lista
		System.out.println(lista.contains("Majo"));
		
		//Devuelve la posicion donde se encuentra al elemento por 
		//primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la ultima posicion donde encuentra el elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista
		lista.remove(6);
		System.out.println(lista);
		
		//añadir elementos a la lista indicando una determinada posicion
		lista.add(2, "Celso");
		System.out.println(lista);
		//No remplaza los valores del indice indicado, si no que recorre las posiciones
		//hacia delante
		
		//Remplazar el valor de una posicion
		lista.set(4, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista
		//e imprimirlos en una nueva linea
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista
		//con elementos object o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));

	}

}
