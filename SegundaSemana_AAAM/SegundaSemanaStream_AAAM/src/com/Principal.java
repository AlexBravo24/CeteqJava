package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {


		//API Stream - funcionalidad a partir de java8 que nos va a permitir gestionar de una forma mas rapida e imperativa la info
		//que tengamos en nuestras colecciones de datos, las colecciones se vuelven un flujo de datos a partir del cual podemos solicitar la info que se necesite
		
		//Ejemplo del uso de Stream
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
				.filter(item->item.contains("i"));
		
		//System.out.println(nombres);  //java.util.stream.ReferencePipeline$2@87aac27, Esto aparece si no se filtra el flujo y se lleva a una variable
		
		//una vez filtramos la informacion la llevo hacia una lista
		List<String> names = nombres.collect(Collectors.toList());
		
		//Mostrar resultados en consola
//		System.out.println(names);
		
		
		//Decalaramos una lista para guardar a nuestros objetos "persona"
		List<Persona> original = new ArrayList<Persona> ();
		
		//Crear una lista para recolectar la info filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a la lista "original"
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
		
		//Imprimir la lista original en consola
		System.out.println(original);
		
		
		System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		
		//Recorrer la lista para ver cada elemento con un ciclo for
		for (int i = 0; i < original.size(); i++) {
			System.out.println(original.get(i));
		}
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		//Recuperar todos los elementos con el ciclo forEach
		for (Persona i:original) {
			System.out.println(i);
		}

		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
									
		
														
		//forEach pero ahora a través de nuestra lista
		original.forEach(a -> System.out.println(a));
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		//Si Filtraramos a los elementos del genero masculino con un ciclo convencional:
		for (Persona i: original) {
			if (i.getGenero().equals("MASCULINO")) {
				filtrada.add(i);
				System.out.println(i);
			}
		}
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
	
							
		//Filtrar en el API Stream a ñas personas de genero femenino
		filtrada=original.stream()
				.filter(item -> item.getGenero().equals("FEMENINO"))
				.collect(Collectors.toList());
//		filtrada.forEach(a->System.out.println(a)); //Asi se manda a imprimir con Lamda
		filtrada.forEach(System.out::println);
														
		
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
														
		//Ordenar a las personas por edad ascendente
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		filtrada.forEach(System.out::println);
		
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		
		//Contar el numero de elementos de la lista
		System.out.println(original.stream().count());
		
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		
		//Contar el numero de elementos de la lista 2
		long conteo	= original.stream().count()	;
		System.out.println(conteo);
		
		
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		
		//Solicitar una variable booleana si algun elemento cumple con alguna condicion
		boolean alguno=original.stream().anyMatch(a->a.getEdad()<30);
		System.out.println(alguno);
		
		
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		
		//Solicitar una variable booleana si todos los elementos cumplen alguna condicion
		boolean alguno1=original.stream().allMatch(a->a.getEdad()<30);
		System.out.println(alguno1);
		
		
		
		
														System.out.println(); //Solo un divisor para ver las diferentes impresiones, no importa
		
		
		
		
		//Retornar un valor a una clase Optional, Optional es una clase que nos permite manejar valores nulos en caso de que no se encuentren
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
														
														
	}

}
