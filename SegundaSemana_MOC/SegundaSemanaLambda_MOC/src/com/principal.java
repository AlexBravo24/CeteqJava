package com;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Expresiones o funciones lambda
		//Son expresionaes o funcional anonimas
		//impementan uns interface funcional
			
		//Esto nos permite definir un metodo para uso inmediato
		//sin necesidad de crear una clase que lo defina
			
		//Su operador es (->)
		//Su sintaxis es (parametros)-> {(cuerpo de lambda)};
			
		//Crear una instancia de una clase anonima, 
		//que implemente nuestra interface funcional
		IFuncinal suma = (a,b) -> System.out.println("La suma es: "+(a+b));
		
		//Puedo utilizar el metodo operacion, atraves del objeto suma
		suma.operacion(19, 2);
		
		IFuncinal resta = (x,y) -> System.out.println("La resta es: "+(x-y));
		
		resta.operacion(10, 7);
			

	}

}
