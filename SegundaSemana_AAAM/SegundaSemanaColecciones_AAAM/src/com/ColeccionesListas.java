package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		
		// Listas - Son una coleccion de datos o elementos definida como una sucesion de los mismos
		// Se implementa a traves de la interfase List y por medio de un array redimensionable de la clase "ArrayList"
		// Admiten valores duplicaods, es de la colecciones mas utilizadas y con mejor rendimiento
		// no permiten almacenar tipos de datos priitivos pero si de ipo objeto (String, Wrapper, etc)
		
		//Declarar una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>();  //tanto List como ArrayList se tienen que importar de java.util
		
		
		//Agregar elemntos a nuestra lista 
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		//Devolver un valor booleano si el elemento existe en la lista (devuelve el valor false ya que "Alex" no existe en la lista)
		System.out.println(lista.contains("Alex"));
		//Devolver un valor booleano si el elemento existe en la lista (devuelve el valor true ya que "Gabriela" si existe en la lista)
		System.out.println(lista.contains("Gabriela"));
		
		//Devolver la posicion donde se encuentra al elemenmto por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devolver la ultima posicion dopnde se encuentra el elemento 
		System.out.println(lista.lastIndexOf("Alberto"));
				
		//Eliminar un elemento de la lista (remueve al primero que encuentra
		lista.remove("Alberto");
		System.out.println(lista);
		
		//Elmina un elemento por la posicion
		lista.remove(4);
		System.out.println(lista);

		//Añadir elementos a la lista indicando una determinada posicion, se agrega el elemento y desplaza las posiciones, no borra el elemento del indice indicado
		lista.add(2, "Celso");
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuerar todos los valores de la lista e imprimirlos en una nueva linea 
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos object o si no la parametrizo
		List<Object> coleccion =new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		System.out.println(coleccion);
		
		
		//Tambien se puede sin parametrizar la lista
		List coleccion1 =new ArrayList();
		coleccion1.add("Apellido");
		coleccion1.add(52);
		coleccion1.add(1.23456);
		coleccion1.add(false);
		coleccion1.add('&');
		System.out.println(coleccion1.get(2));
		
		
		
		
	}

}
