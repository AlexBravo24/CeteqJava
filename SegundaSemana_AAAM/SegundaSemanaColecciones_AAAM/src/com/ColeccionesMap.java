package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		
		//La interfaz map asocia o alacena los datos en pares (clave - valor a alacenar)
		//Las claves no pueden duplicarse, es decir, la clave actua como un identificador unico para cada elemento a almacenar
		
		//declaracioon de un map y la clase HasMap para almacenar claves de tipo Integer y elementos de tipo String
		Map<Integer, String> usuarios = new HashMap<Integer, String>(); //Map y HashMap tambien se deben importar de java.io
		
		//Agregamos elementos a nuestro HashMap
		usuarios.put(1, "Angel");  //Las claves no se deben declarar de forma consecutiva
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		System.out.println(usuarios); //en consola si se imprimiran en orden
		
		//Imprimir en la consola un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Imprimir en cosola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en cosola los valores contenidos en i HashMap
		System.out.println(usuarios.values());
		
		//Mandar a imprimir cada una de las llaves con un ciclo for each
		for (Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		//Mandar a imprimir cada una de las llaves con un ciclo for each
		for (String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores individualmente en una linea
		for(Integer i: usuarios.keySet()) {
			System.out.println("LLave: " + i + " Valor: " + usuarios.get(i));
		}
		
		
		

	}

}
