package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList <String>();
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		System.out.println(lista);
		
		System.out.println(lista.get(2));
		
		System.out.println(lista.contains("Gabriela"));
		
		System.out.println(lista.indexOf("Alberto"));
		
		System.out.println(lista.lastIndexOf("Alberto"));
		
		lista.remove("Alberto");
		lista.remove(5);
		
		System.out.println(lista);
		
		lista.add(2, "Celso");
		System.out.println(lista);
		
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		for (int i = 0; 1<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		List<Object> coleccion = new ArrayList <Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		

	}

}
