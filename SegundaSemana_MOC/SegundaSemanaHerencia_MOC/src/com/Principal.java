package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a probar crear una nueva persona
		//Cuando una clase se vuelve abstracta, no podemos instanciarla
		//es decir, no podemos crear objetos con esa clase
		//Persona juan = new Persona("Juan", "Masculino", 27);
		
		//Vamos a probar crear un nuevo empreado
		Empleado jorge= new Empleado("Jorge", "Masculino", 33, "JAOSfj2","Desarrollador", "Matutino", 30000);
		
		//Existe el polimorfismo de asignacion
		Persona juan=new Empleado();
		
		
		//creamos una persona a traves de la clase empleado
		
//		System.out.println(juan);
//		System.out.println(jorge);
		
		//Probar llamar el metodo dormir a traves de nuestra 
		//persona juan
		//juan.dormir();
		//Probar el mismo metrodo a traves de nuestro empleado jorge
		jorge.dormir();
		
		//Probando el metodo con retorno saludar a traves de juan
		//String hello=juan.saludar();
		//System.out.println(hello);
		//System.out.println(juan.saludar());
		
		//ver como funciona el metodo saludar polimorfico
		jorge.saludar("Hola generacion");
		
		//Probar metodo saludar con dos argumentos
		jorge.saludar("Buenas tardes", " son las 12 pm");
		jorge.sumar(10, 7);
		
		//Puedo llamar a jorge y utilizar el metodo comer
		jorge.comer("Ensalada");
		
		Animal Bruno = new Animal("Bruno", 2, "omnívoro");
		//Utilizando la herencia
		Perro Kenai = new Perro("Kenai", 3, "omnívoro", "Boxer", "Grande", "Masculino");
		
//		System.out.println(Bruno);
//		System.out.println(Kenai);
	}

}
