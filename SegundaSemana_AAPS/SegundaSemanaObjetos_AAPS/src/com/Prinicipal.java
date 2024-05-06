package com;

public class Prinicipal {

	public static void main(String[] args) {
		
		
		// Ejemplo de crear nuestro primer objeto de la clase Persona
		// con su constructor vacio. 
		
		Persona persona1 = new Persona(); 
		
		// La sintaxis se  puede ver como: Clase variable = new Clase();
		// a esto se le conoce como Clase Instancia (variable u objeto)
		
		//Ejemplo de crear a un segundo objeto  de la clase Persona
		// pero con el constructur que pide los atributos desde el incio
		
		Persona persona2 = new Persona("Andrés", "Masculino");
	
		// Asginando valores a los atributos de mi persona1
		// que está vacio 
		
//		persona1.nombre="Alex"; --- esta fue la forma incorrecta de asginar 
		// valores a los atributos de nuestros objetos
		// hay que protegerlos con los modificadores de acceso
		
		// Establecer un valor a mi persona1 (vacio) en el caso de su nombre
		
		persona1.setNombre("Alex");
		
		// Ejemplos del uso del metodo Get, para recuperar el nombre de persona1
		
		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());
		
		String nombrePersonaFavorita = persona2.getNombre();
		
		// ¿Que ocurre si quiero mandara  imprimir mi objeto en consola directamente?
		
		System.out.println(persona2);
		
		// Actividad: realizar tres clases para creas tres diferentes objetos
		// cada objeto que se quiera modelar debe contar con por lo menos tres atributos
		
		// Una vez creada la plantilla o clase, instanciar los objetos en esta misma clase
		// principal e instanciar uno vacío, uno con todos los atributos y se mandan
		// a imprimir en consola
		
		// EJEMPLO: clase Celular
		
//		Celular iPhone = new Celular();
//		
//		Celular samsung = new Celular("Samsung", "S23", "Black", 2200.99);
//		
//		iPhone.setModelo("15");
//		
//		System.out.println(iPhone);
//		
//		System.out.println(samsung);
		
		
////		 EJEMPLO 1 (por mi)
//		
//		// Método constructor vacío
//		Auto hatchback = new Auto ();
//		
//		hatchback.setMarca("Audi");
//		
//		hatchback.setColor("Gris");
//		
//		hatchback.setAño(2018);
//		
//		System.out.println(hatchback);
//		
//		// Método constructor con todos los parámetros
//		Auto sedan = new Auto ("Nissan" , "Café", 2020);
//		
//		System.out.println(sedan);
//		
////		EJEMPLO 2 (por mi)
//		
//		// Método constructor vacío
//		Calzado deportivo = new Calzado ();
//		
//		deportivo.setMarca("Nike");
//		
//		deportivo.setColor("Rojo");
//		
//		deportivo.setTalla(27.5);
//		
//		System.out.println(deportivo);
//		
//		// Método constructor con todos los parámetros
//		
//		Calzado casual = new Calzado ("FILA", "Negro", 28.5);
//		
//		System.out.println(casual);
		
		// Voy a mandar a imprimir a la persona1
		
		System.out.println(persona1);
		
		// Con modificar static, creamos atributos o métodos de clase 
		// que aplican para todos los objetos creados de esa clase, con static
		// aun podemos modificar el valor para todos los objetos de la clase,
		// si fuera necesario. Ejemplo: actualizar un precio. 
		
		// Con modificador static final, creamos valores inmutables y
		// no pueden ser modificados
	}

}
