package com;

public class Principal {

	public static void main(String[] args) {
		// expresiones o funciones lambda
		//son expresiones o fucniones "anonimos"
		//que implementan una interface
		//funcional
		
		//esto nos permite definir ese metodo para
		//su uso inmediato, sin necesidad de crear
		//una clase que lo defina
		
		//su operador es (->)
		//su sintaxis es (prametros) -> {(cuerpo de lambda)};
		
		//crear una instancia de una clase anonima, que implemente
		//nuestra interface funcional
		
		IFuncional suma = (item1, item2) -> System.out.println("la suma es: " + (item1 + item2));
		
		//puedo utlizar el metodo llamado opeacion, a travez del objeto suma
		suma.operacion(19, 2);
		
		IFuncional resta = (x,y) -> System.out.println("La resta es: " + (x - y));
		
		resta.operacion(10, 7);
		
		
		
	}

}
