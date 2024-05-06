package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica casio = new Cientifica ("Casio", "Azul", 15);
		
		System.out.println(casio);
		
		casio.sumar(8, 3);
		
		casio.restar(10, 5);
		
		casio.multiplicar(20, 4);

		casio.dividir(30, 5);
		
		casio.tomarTemp();
		
		// ¿De donde toman comportamientos nuestras clases u objetos?
		// 1.- de métodos propios
		// 2.- de otras clases heredandolos, incluyendo clases abstractas
		// 3.- de interfaces
		
	}

}
