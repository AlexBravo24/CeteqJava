package com;

public class Principal {

	public static void main(String[] args) {
		
		// Vamos a probar crear una nueva persona
		// Cuando una clase de vuelve asbtracta no podemos instanciarla, es decir,
		// no podemos crear objetos de esa clase
//		Persona Juan = new Persona("Juan", "Masculino", 27);

//		System.out.println(Juan);
		
		
//		String infromacion = Juan.toString();
		
//		System.out.println(infromacion);
		
		
		// Probar llamar el método dormir a través de nuestra persona Juan
		
//		Juan.dormir();
		
		// Probando el método con retorno saludar a través de Juan
		
//		String hello = Juan.saludar();
//		System.out.println("Buenos días");
		
//		System.out.println(Juan.saludar());
		
		//Vamos a probar a crear a un nuevo empleado
		Empleado Jorge = new Empleado ("Jorge", "Masculino", 33, "JRGF9776", "Desarrollo", "Matutino", 30000);
		
		System.out.println(Jorge);
		
		// Polimorfismo de asignación
		Persona juan = new Empleado();
		
		System.out.println(juan);
		
		// Probando llamar el mismom método pero a través de nuestro empleado Jorge
		
		Jorge.dormir();
		
		// Ver como funciona el método saludar polimorfico.
		
		Jorge.saludar("Hola generación ceteq");
		
		// Vamos a probar el método saludar que pide dos argumentos
		Jorge.saludar("Buenas tardes", " son las 12 PM");
		
		//Vamos a probar el método suma que pide dos valores enteros
		Jorge.sumar(10, 7);
		
		// Puedo llamar a Jorge y utilizar el método comer
		Jorge.comer("Ensalada");
		
		// ACTIVIDAD
		// Creas otras dos clases, una que ea clase Padre y otra que sea clase Hija
		// Ejemplo: Clase Persona (Padre) --> Clase Estudiante (Hija)
		
//		Playera Nike = new Playera("Rojo", "Mediana", 346789);
	
//		System.out.println(Nike);
		
//		Deportiva Champion = new Deportiva("Verde", "Grande", 456902, "Correr", "Juniors", 12);
		
//		System.out.println(Champion);
		
		
		
	}

}
