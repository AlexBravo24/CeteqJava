package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - son una coleccion de datos o elementos
		//definica como una sucesion de los mismo
		// esta coleccion se implementa a travez de la interface list
		//y por medio de un array redimensionable de la clase
		//ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mejor rendimiento
		//no podemos guardar tipo de dato primitivo
		//pero si datos de tipo objeto (String, Wrapper, etc)
		
		//declarar una lista de elementos tipo String
		List<String> lista = new ArrayList<String>();
		
		//agragar elementos a nuestra lista
		lista.add("Adriana");
		lista.add("carlos");
		lista.add("sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//imprimir una lista en consola
		
		System.out.println(lista);
		
		// imprimir o recuperar el valor de un solo elemento de la lista
		
		System.out.println(lista.get(2));
		
		//devuelva un valor booleano si el elemento existre en la lista
		System.out.println(lista.contains("Gabriela"));
		
		//devuelve la posicion donde se encuentra al elemento por primera vez
		
		System.out.println(lista.indexOf("Alberto"));
		
		//devuelve la ultima posicion donde encuentra al elemento
		
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//eliminar un elemento de mi lista
		
		lista.remove(5); //tambien se puede introducir el elemento entre comillas
		System.out.println(lista);
		
		//añadir elementos a la lista indicando una determinada posicion
		lista.add(2, "Celso"); //se agrega el elemento y desplaza las posiciones
		// no reemp;aza el elemento del indice indicado
		
		System.out.println(lista);
		
		//reemplaza valores de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//recorrer o recuperar todos los valores de mi lista
		//e imprimirlos en una nueva linea
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//puedo almacenar varios elementos di parametrizo mi lista
		//con elementos Objeto o si no la parametrizo
		
		List<Object>coleccion = new ArrayList<Object>();
		
		coleccion.add("nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add('$');
		
		
		
		
		

	}

}
