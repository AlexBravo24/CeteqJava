package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica calcCassio = new Cientifica("Cassio", "Negra", 150);
		System.out.println(calcCassio);
		calcCassio.suma(0, 0);
		calcCassio.resta(0, 0);
		calcCassio.multiplicacion(0, 0);
		calcCassio.division(0, 0);
		
		System.out.println("");
		System.out.println("Iniciemos con operaciones de tres numeros: ");
		System.out.println("");
		
		calcCassio.suma(0, 0, 0);
		calcCassio.resta(0, 0, 0);
		calcCassio.multiplicacion(0, 0, 0);
		calcCassio.division(0, 0, 0);
		
		calcCassio.tomarTemperatura();
		
		//¿De donde toman comportamientos nuestras clases u objetos?
		//1.-De métodos propios
		//2.-De otras clases heredandolos, incluyendo cases abstractas
		//3.-De interfases
	}

}
