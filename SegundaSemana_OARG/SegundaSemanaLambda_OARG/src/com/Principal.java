package com;

public class Principal {

	public static void main(String[] args) {

		// Expresiones o Funciones Lambda
		// Son expresiones o funciones anonimas que implementan una interface funcional

		// Esto nos permite definir ese método para su uso inmediato, sin necesidad de
		// crear Una clase que lo defina
		
		//su operador es (->)
		//Su sintaxis es (parametros)->{(cuerpo de lambda)};
		
		//Crear una instancia de una clase anonima, que implemente nuestra interface funcional 
		
		IFuncional suma = (a,b) -> System.out.println("La suma es: "+(a+b));
		
		//Puedo utilizar el metodo llamado operacion, a travez del objeto suma
		suma.operacion(19, 2);
		
		IFuncional resta = (a,b) -> System.out.println("La resta es: "+(a-b));
		resta.operacion(10, 7);
		
		

	}

}
