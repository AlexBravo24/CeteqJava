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
		
		
		// Probar llamar el m�todo dormir a trav�s de nuestra persona Juan
		
//		Juan.dormir();
		
		// Probando el m�todo con retorno saludar a trav�s de Juan
		
//		String hello = Juan.saludar();
//		System.out.println("Buenos d�as");
		
//		System.out.println(Juan.saludar());
		
		//Vamos a probar a crear a un nuevo empleado
		Empleado Jorge = new Empleado ("Jorge", "Masculino", 33, "JRGF9776", "Desarrollo", "Matutino", 30000);
		
		System.out.println(Jorge);
		
		// Polimorfismo de asignaci�n
		Persona juan = new Empleado();
		
		System.out.println(juan);
		
		// Probando llamar el mismom m�todo pero a trav�s de nuestro empleado Jorge
		
		Jorge.dormir();
		
		// Ver como funciona el m�todo saludar polimorfico.
		
		Jorge.saludar("Hola generaci�n ceteq");
		
		// Vamos a probar el m�todo saludar que pide dos argumentos
		Jorge.saludar("Buenas tardes", " son las 12 PM");
		
		//Vamos a probar el m�todo suma que pide dos valores enteros
		Jorge.sumar(10, 7);
		
		// Puedo llamar a Jorge y utilizar el m�todo comer
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
