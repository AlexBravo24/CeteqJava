package com;

public class Principal {

	public static void main(String[] args) {
		// antes de crear nuestro celular debemos crear 
		//los objetos que forman parte de los celulares
		
		Camara canon = new Camara("Canon", 2, 48);
		
		Procesador snap = new Procesador("AmLogic", "Snapdragon", 3.5);
		
		Ram kingston = new Ram ("Kingston", "DDR5", 8);
		
		//ahora si ya podemos crear nuestro celular y le pasamos los valores 
		// de la camara, procesador y ram
		
		Celular motorola = new Celular("Motorola", "z2", "Negro", canon, snap, kingston);
		
		//manda a imprimir en consola
		
		System.out.println(motorola);
		
		//crear un objeto que se componga por lo menos de otros 3
		//ej. una computadora, con atributos prpios como color, marca,
		// y que se compone de procesador, almacenamiento y ram
		// ej. auto - llanta, estereo, motor

	}

}
