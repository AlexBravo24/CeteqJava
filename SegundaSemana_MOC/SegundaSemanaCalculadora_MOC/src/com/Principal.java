package com;

public class Principal {

	public static void main(String[] args) {
		Cientifica calc= new Cientifica("Casio",8,"Led");
		calc.dividir(5, 1);
		calc.sumar(1, 2);
		calc.restar(5, 3);
		calc.multiplicar(6, 7);
		
		calc.sumar(1, 2, 3);
		calc.restar(10, 2, 1);
		calc.multiplicar(6, 5, 10);
		calc.dividir(80, 41, 15);
		
		calc.tomarTemperatura();
		
		//¿De dónde toman comportamientos nuestras clases objetos?
		//1.- Métodos propios
		//2.- De otras clases, heredandolos, incluyendo clses abstractas
		//3.- Interfaces
		
	}

}
