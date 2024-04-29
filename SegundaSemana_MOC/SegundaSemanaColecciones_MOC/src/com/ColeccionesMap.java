package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz Map asocia o almacena los datos 
		// en pares (clave-valor a almacenar)
		//las claves no pueden  duplicarse
		
		//La clave actua como un identificador unico
		//para cada elemento a almcanerar (ID)
		
		//Declaracion de un Map y la clase HashMap
		//para almacenar claves de tipo interfer y elementos de tipo
		//String
		
		Map<Integer, String> usuarios=new HashMap<Integer,String>();
		//Agregamos elementos a nuestroHashMap
		usuarios.put(1, "Angel");
		usuarios.put(2, "Karla");
		usuarios.put(3, "Pedro");
		
		//Imprimir mi HashMap en consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en mi HashMao
		System.out.println(usuarios.values());
		
		//Imprimir  cada una de las llaves con un ciclo for each
		for(Integer i:usuarios.keySet()) {
			System.out.println(i);
		}
		
		//Imprimir  cada una de las llaver con un ciclo for each
		for(String i:usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores individualmente en una linea
		for(Integer i:usuarios.keySet()) {
			System.out.println("LLave: "+i+" Valor: "+ usuarios.get(i));
		}

	}

}
