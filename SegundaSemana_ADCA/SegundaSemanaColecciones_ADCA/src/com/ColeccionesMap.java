package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// la interfase map asocia o almacena los datos
		// en pares (clave / valor a almacenar)
		//las claves no pueden duplicarse
		
		//es decir, la clave actua como un identificador unico
		//para cada elemento a almacenar (ID)
		
		//declaracion de un Map y la clase HashMap
		//para almacenar claves de tip0o integer y elementos de tipo 
		//String
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//agregamos elementos a nuestro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(2, "Karla");
		usuarios.put(3, "Pedro");
		
		// imprimir mi HashMap en consola
		
		System.out.println(usuarios);
		
		// imprimir en pantalla un solo valor almacenado en 
		// una determinada clave
		
		System.out.println(usuarios.get(2));
		
		//eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		
		System.out.println(usuarios);
		
		//Imprimir en consola la llaves de mi HashMap
		
		System.out.println(usuarios.keySet());
		
		//imprimir en consal los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//mandar a imprimir cada una de las llaves con un ciclo
		//for each
		
//		for(Integer i: usuarios.keySet()){  // lo anterior es para imprimir su llave
//			System.out.println(i);
		
		//mandar a imprimir cada una de las valores con un ciclo
		//for each
		
		for(String i: usuarios.values()){   //manda a imprimir el valor
		System.out.println(i);
			
		}
		
		// imprimir llaves y valores
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llave: " + i + " Valor: " + usuarios.get(i));
			
		}
		

	}

}
