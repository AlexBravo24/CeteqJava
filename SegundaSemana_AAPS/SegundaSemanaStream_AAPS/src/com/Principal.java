package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// Api Stream: es una funcionalidad que existe a partir de Java 8
		// que nos va a permitir gestionar de una forma más rápida e imperativa
		// la infromación que tengamos en nuestras colecciones de datos.
		// Las colecciones se vuelven un flujo de datos a aprtti del cual podemos
		// solicitar la infromación que necesitemos
		
		//Ejemeplo del uso de Stream
//		Stream <String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
//				.filter(a -> a.contains("i"));
		
		// Una vez filtramos la infromación, la llevo hacia una lista
//		List <String> names  =  nombres.collect(Collectors.toList());
		
		// Mostrar los resultados en consola
//		System.out.println(names);
		
		// Declaramos una lista para guardar nuestro objeto persona 
		List<Persona> original = new ArrayList <Persona>();
		
		// Crear una lista para recolectar la infromacion filtrada
		List <Persona> filtrada = new ArrayList <Persona>(); 
		
		// Añadir elementos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucina", "FEMENINO", 26));		
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));
		
		// Si quiero mandar a imprimir mi lista original en consola en un mismo renglon
//		System.out.println(original);
		
		// Para recorrer nuestra lista y los elementos en lista con ayuda de un ciclo for
//		for (int i=0 ; i<original.size(); i++) {
//			System.out.println(original.get(i));
//		}
		
		// Recuperar todos los elementos y verlos como lista, pero ahora con un ciclo forEach
//		for (Persona i:original) {
//			System.out.println(i);			
//		}
		
		// Imprimir el mismo ciclo forEach pero ahora a traves de nuestra lista
//		original.forEach(a -> System.out.println(a));
		
		// Si filtraramos a los elementos del genero MASCULINO con un ciclo convencional
//		for (Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//			filtrada.add(i);
//			System.out.println(i);
//			}
//		}
		
		// Filtrar con el API Stream a las personas del genero FEMENINO
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
		
		//Puedo imprimir lo anterior con esta sintaxis
//		filtrada.forEach(a -> System.out.println(a));
		
		// o con esta sintaxis
//		filtrada.forEach(System.out::println);
		
		// Ordenar a las personas por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println);
		
		// Contar el numero de elementos de mi lista
//		long conteo = original.stream().count();
//			
//		System.out.println(conteo);
		
		// Solicitar una variable boolean si algun elemento o todos los elementos cumplean
		// con una condición
		
//		boolean alguno = original.stream().anyMatch(a ->a.getEdad()<30); 
//		// con anyMatch puedo preguntar si entre mis elementos alguno es menor a treinte
//		// o con allMatch puedo preguntar si todos mis elementos su edad es menor a treinta
//		
//		System.out.println(alguno);
		
		// Retornar un valor a una clase Optional; Optional es una clase que nos permite manejar 
		// valores nulos, en caso de que no se encuentre
		
//		Optional<Persona> menorEdad = original.stream()
//				.min(Comparator.comparing(Persona::getEdad));
//		
//		System.out.println(menorEdad);
		
	}
}
