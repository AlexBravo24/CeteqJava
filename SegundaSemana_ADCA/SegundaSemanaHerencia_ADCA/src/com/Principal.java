package com;

public class Principal {

	public static void main(String[] args) {
		
		// vamos a probar crear una nueva perosna
		//cuando una clase se vuelve abstracta, no podemos instanciarla
		// es decir, no podemos crear objetos de esa clase
		
		//Persona juan = new Persona ("Juan", "Masculino", 27);
		
		//vamos a probar a crar un nuevo empleado 
		Empleado jorge = new Empleado("Jorge", "Masculino", 33, "JRGF9775", "Desarrollador", "Matutino", 30000);
		
		//polimorfismo de asignacion
		Persona juan = new Empleado();
		
		System.out.println(juan);
		
		System.out.println(jorge);
		
		//String informacion = juan.toString();
		//System.out.println(informacion);
		
		//provar llamar el motodo dormir a travez de 
		//nuestra persona juan
		
		//juan.dormir();
		
		//probar el mismo metodo pero a travez de nuestro empleado jorge
		jorge.dormir();
		
		//probando el metodo con retorno saludar
		// a travez de juan
		//String hello = (juan.saludar());
		//System.out.println(juan.saludar());
		
		// ver como fuciona el metodo saludar polimorfico
		jorge.saludar("hola generacion ceteq");
		
		//probar el metodo saludar que pide dos argumentos
		jorge.saludar("buenas tardes ", "son las 12 pm");
		
		jorge.sumar(21, 7);
		
		//puedo llamar a jorge y utilizar el motodo comer
		jorge.comer("ensalada");

	}

}
