package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API String - Funcionalidad a part de java 8
		// que nos va a permitir gestionar de una forma mas
		// rapida e imperativa la informacion que tengamos
		// en nuestras colleciones de datos
		//las colecciones se vuelven un flujo de datos a partir
		// del cual podemos solicitar la informacion que necesitemos
		
		//ejemplo
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
				.filter(item -> item.contains("i"));
		
		//una vez filtramos la informacion la llevo hacia una lista
		List<String> names = nombres.collect(Collectors.toList());
		
		//mostar los resultados
		System.out.println(names);
		
		//declaramos un alista par guardar a nuestres objetos Persona
		List<Persona> original = new ArrayList<Persona>();
		
		//creamos una lista para recolectar la informacion filtrada
		List<Persona>filtrada = new ArrayList<Persona>();
		
		//Anadir elementos a mi lista original
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
		
		//System.out.println(original);
		
		//recorrer nuestra lista para ver cada elemento con el un ciclo for
		
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			
//		}
		
//		//Recuperar todos los elementos conel ciclo forEach
//		for(Persona i: original) {
//			System.out.println(i);
//		}
		
		//forEach pero ahora a travez de nuestra lista
		
		//original.forEach(a -> System.out.println(a));
		
		//si filtraramos a los elementos del genero maculino
		//con un ciclo convencional
//		for(Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				
//				filtrada.add(i);
//				System.out.println(i);
//				
//			}
//		}
		
		//filtar con el API Stream a las personas del genero femenino
		
//		filtrada = original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(a -> System.out.println(a)); // imprime 
//		
//		filtrada.forEach(System.out::println);
		
		//ordenar a las personas por edad ascendente
		filtrada = original.stream().sorted(Comparator.comparing(Persona::getEdad))
				.collect(Collectors.toList());
		filtrada.forEach(System.out::println);
		
		//contar el numero de elementos de mi lista
		long conteo =  original.stream().count();
		
		System.out.println(conteo);
		
		//solicitar una variable booleana si algun elemento o todos
		//los elementos cumplen alguna condicion
		
//		boolean alguno = original.stream().anyMatch(a -> a.getEdad() < 30);
//		System.out.println(alguno);
		
		//retornar un valor a una clase optional
		//optional es una clase que nos permite manejar valores nulos,
		// en caso de que no se encuentren 
		
		Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		

	}

}
