package com;

public class Principal {

	public static void main(String[] args) {
		
		Cientifica casio = new Cientifica("Casio", "Azul", 200);
		System.out.println(casio);
		
		System.out.println();//SALTO DE LINEA
		
		System.out.println("OPERACIONES DE 2 NUMEROS" );
		casio.sumar(10, 20);
		casio.restar(5, 10);
		casio.multiplicar(10, 2);
		casio.dividir(10, 2);
		
		
		System.out.println();//SALTO DE LINEA
		
		
		System.out.println("OPERACIONES DE 3 NUMEROS");
		casio.sumar(10,10,10);
        casio.restar(5,1,2);
        casio.multiplicar(10,2,3);
        casio.dividir(100,5,2);
        
        System.out.println();//SALTO DE LINEA
        
        System.out.println("TEMPERATURA");
        casio.tomarTemperatura();
        
        //De donde toman comportamientos nuestras clases u objetos?
        //1.- Métodos propios
        //2.- De otras clases heredandolos incluyendo clases abstractas
        //3.- De interfaces
	}

}
