package com;

public class Principal {

	public static void main(String[] args) {
		
		//Expresiones o funciones Lambda son expresiones o funciones "anonimas" que implementan una interface funcional
		//Esto nos permite definitr ese metodo para uso inmediato sin necesidad de crear un clase que lo defina
		//Su operador es ->  y su sintaxcis es (parametros) -> {(cuerpo de Lambda)};
		
		//Creamos instancia de una clase anónima que implemente nuestra clase funcional
		IFuncional suma = (a, b) -> System.out.println("La suma es: " + (a+b));  //no es necesasrio ponerle el nombre de la variable declara de la interfase, por eso son anonimos, se podria cambiar "a" por "item1" y aún así funcionaría
		
		
		//Puedo utilizar el metodo llamado operacion a traves del objeto suma
		suma.operacion(19, 2);
		
		
		IFuncional resta = (x,y) -> System.out.println("La resta es: " + (x-y));
		resta.operacion(10, 7);
		
		

	}

}
