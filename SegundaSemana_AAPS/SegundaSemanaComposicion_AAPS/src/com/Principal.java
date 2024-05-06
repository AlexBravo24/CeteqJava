package com;

public class Principal {

	public static void main(String[] args) {
		
		// Antes de crear nuestro celular debemos crear los objetos que 
		// formaran parte de los celulares

//		Camara canon = new Camara("Canon", 2, 48);
//		
//		Procesador snap = new Procesador("AmLogic", "Snapdragon", 3.5);
//		
//		Ram kingston = new Ram("Kingston", "DDR5", 8);
//		
//		// Ahora si ya podemos crear nuestro celular y le pasamos los valores de
//		// la camara, procesador y ram
//		
//		Celular Motorola = new Celular("Motorola", "Z2", "Negro", canon, snap, kingston);
//		
//		// Mandamos a imprimir en consola nuestro celular
//		
//		System.out.println(Motorola);

		
		// ACTIVIDAD
		// Crear un objeto que se componga por lo menos de otros tres,
		// ejemplo: una computadora con atributos propios como marca, color, modelo
		// pero que ademas se compone de Procesador, Almacenamiento y Ram.
		
		Corte recto = new Corte("Recto", "Adulto");
		
		Cierre normal = new Cierre(1, "Acero Inoxidable");
		
		Tipo jeans = new Tipo("Largo", "Sin rasgaduras");
		
		Bottom Levis = new Bottom("Levis", "Azul", "Grande", recto, normal, jeans);
		
		System.out.println(Levis);
		
	}

}
