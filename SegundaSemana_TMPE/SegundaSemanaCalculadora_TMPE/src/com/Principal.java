package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica casio = new Cientifica("Casio", "Negro",60.50);
	
	System.out.println(casio);
	
	casio.sumar(10, 2, 3);
	casio.sumar(5,5);
	casio.restar(10, 2, 3);
	casio.restar(10, 2);
	casio.multiplicar(10, 2, 3);
	casio.multiplicar(10, 2);
	casio.dividir(10, 2, 3);
	casio.dividir(10, 2);
	
	casio.tomarTemeratura();
		
	//¿De dónde toman comportamientos nuestras clases
	//objetos?
	//1.- De métodos propios 
	//2.- De otras clases heredandolos, incluyendo clases
	//abstractas 
	//3.- De interfaces 
	
	
	
	
	}






}


