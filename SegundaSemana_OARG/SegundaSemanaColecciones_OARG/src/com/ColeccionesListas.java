package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		// Listas - Son una colección de datos o elementos definida como una secesión de los mismos
		//Esta colección se implementa a travez de la interface list  y por medio de un array redimensionable 
		//de la calse ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones más utilizadas y con mejor rendimiento 
		
		//No podemos guardar tipos de datos primitivos pero si datos de tipo Objeto (String, Wrapper, etc)
		
		//Declarar una lista de elementode tipo String
		
		List<String>lista=new ArrayList <String>();
		
		//Agregare elementos o valores a nuestra lista 
		lista.add("Obed");
		lista.add("Armando");
		lista.add("Rosas");
		lista.add("Galvan");
		lista.add("Edgar");
		lista.add("Galvan");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		//Duvuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Edgar"));
		
		//Devuelve la posición donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Galvan"));
		
		//Duvuelve la ultima posición donde encuentra al elemento 
		System.out.println(lista.lastIndexOf("Galvan"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posición 
		lista.add(2, "David"); //Se agrega el elemento y desplaza las posiciones 
		                       //No remplaza el elemento del indice indicado
		System.out.println(lista);
		
		
		//Remplazar el valor de una detrmindada posicion 
		lista.set(3, "Ranfer");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size () ; i++) {
			System.out.println(lista.get(i));
			
			
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos Object
		//o si no la parametrizo
		List  coleccion = new ArrayList  ();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.14160);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		
		
		
		
		
		

	}

}
