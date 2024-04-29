package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream es una funcionalidad a partir de Java 8 que nos va a permitir
		//gestionar de una forma rapida e imperativa la imformacion que tengamos
		//en nuestras colecciones de datos, las colecciones se vuelven un flujo
		//de datos a partir del cual podemos solicitar la informacion que necesitemos
		
		//Ejemplo del uso de Stream
		Stream<String> nombres= Stream.of("Carlos","Alex","Alberto","Majo","Frida")
				.filter(a-> a.contains("i"));
		//Una vez filtramos la informacion, la llevo hacia uan lista
		List<String> names= nombres.collect(Collectors.toList());
		
		//Monstrar los resultados en consola
		//System.out.println(names);
		
		//Delcaramos una lista para guardar los objetos persona
		List <Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a mi lista original
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
		
		//iMPRIMIR LA LISTA ORIGINAL EN CONSOLA
	//	System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento con un ciclo for
		//for (int i = 0; i < original.size(); i++) {
			//System.out.println(original.get(i));
		//}
		
		//Recuperar todos los elementos con el ciclo for each
//		for(Persona i:original) {
//			System.out.println(i);
//		}
		
		//foreach pero ahora a traves de nuestra lista
		//original.forEach(a -> System.out.println(a));
		
		//Si filtraramos a los elementos del genero masculino con un ciclo convencional
//		for(Persona i:original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		
		//Filtrar con el API Stream a las personas del genero femenino
//		filtrada=original.stream()
//				.filter(a -> a.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		//filtrada.forEach(a-> System.out.println(a));
//		filtrada.forEach(System.out::println);

		//Ordenar a las personas por edad ascendente
//		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		filtrada.forEach(System.out::println);
		
		//Contar el numero de elementos de mi lista
		long conteo=original.stream().count();
		System.out.println(conteo);
		
		//Solicitar una variable boooleana si algun elemento o todos los elementos cumplen
		//una condicion
		
		boolean alguno=original.stream().anyMatch(a->a.getEdad()<30);
		System.out.println(alguno);
		
		//Retornar un valor a una calse Optional
		//Optional es una clase que nos permite manejar valores nulos
		//en caso de que no se encuentren
		
		Optional<Persona> menorEdad= original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);

	}

}
