package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/* API STREAM funcionalidad que permite gestionar de forma
		 * rápida e imperativa la info de las colleciones de datos
		 * 
		 * volvemos las colecciones en un flujo de datos del que 
		 * podemos solicitar información
		 * 
		 * Ejemplo de Stream
		 */
		Stream<String> nombres = Stream.of("Carlos", "Frida", "Alex", "Alberto")
				.filter(a -> a.contains("i"));
//		//una vez filtrado se lleva a una nueva lista
		List<String> names = nombres.collect(Collectors.toList());
//		
//		JOptionPane.showMessageDialog(null, names);
		
		List<Persona> original = new ArrayList<Persona>();
		List<Persona> filtrada = new ArrayList<Persona>();
		
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("César", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("Lucina", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));
		
//		imprimir original en persona
//		System.out.println(original);
		
////		Recorrer la lista por elemento con un ciclo for
//		for (int i=0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}
		
//		Recuperar todos los elementos con el ciclo ForEach
//		for(Persona i:original) {
//			System.out.println((i));
//		}
		
//		forEach a través de la lista
//		original.forEach(a-> System.out.println(a));
		
//		Si filtraramos a los elementos por género masculino
//		for (Persona i: original) {
//			if(i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		 
//		Filtrar con API STREAM a las personas feneminas
//		filtrada = original.stream().filter(item -> item.getGenero()
//				.equals("FEMENINO")).collect(Collectors.toList());
//		
//		//Se puede hacer la llamada mediante Lambda
//		filtrada.forEach(a -> System.out.println(a));
				
//		//también se puede indicando un renglón por línea 
//		filtrada.forEach(System.out::println);
		
		
//		//Ordenar a las personas por edad ascendente		
//		filtrada =original.stream().sorted(Comparator.comparing(Persona::getEdad)).collect(Collectors.toList());
//		filtrada.forEach(System.out::println);
		
//		long conteo = original.stream().count();
//		
//		//Contar el número de elementos en la lista
//		System.out.println(conteo);
		
		//Solicitar un bool si algún elemento o todos cumplen una condición
//		 boolean alguno = original.stream().anyMatch(a -> a.getEdad()<30);
//		 
//		 boolean algunos = original.stream().allMatch(a -> a.getEdad()<30);
//		 
//		 System.out.println(alguno +" : "+ algunos);
		
		//Retornar un valor a una clase Optional, la que permite manejar
//		valores nullos en caso de que no se encuentre		
		Optional<Persona> menorEdad = original.stream()
				.min(Comparator.comparing(Persona::getEdad));
		System.out.println(menorEdad);
		
		
		
		
		 
		
		
		
	}

}
