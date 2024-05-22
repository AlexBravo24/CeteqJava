package com;

public class Principal {

	public static void main(String[] args) {
		
		//ya no puedo crear objetos con clases instanciadas al ser abs
//		Persona juan=new Persona("Juan", "Masculino", 27);
		Empleado jorge =new Empleado ("Jorge", "Masculino", 33, "JRF97762", " DESARROLLADOR", "Matutino", 30);
		
//		//polimorfismo de asignación
//		Persona juan = new Empleado();
		
//		System.out.println(juan);
		System.out.println(jorge);
		
		Departamentos uno = new Departamentos (4,5,4);
		Edificio bosque = new Edificio (400, 120, 256, 4, 8,10);
		
		System.out.println(uno + "\n");
		System.out.println(bosque);
		
//		String informacion = juan.toString();
//		System.out.println(informacion);
		
//		juan.dormir();
		jorge.dormir();
		
		
//		System.out.println(juan.saludar());
		
		//Método saludar polimorfico
		jorge.saludar("Buenas tardes");
		
		jorge.saludar("Buenas noches,","son las 6 pm");
		
		jorge.sumar(10, 5);
		
		jorge.comer(" Ensalada");
		
		jorge.checarEntrada();

	}

}
