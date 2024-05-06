package com;

public class Principal {

	public static void main(String[] args) {
		
		// Expresiones o funciones Lambda: son funciones an�nimas que implementan
		// una interface funcional. Ello nos permite definir ese metodo para su uso
		// inmediato, sin necesidad de crear una clase que lo define.
		
		// Su operador es un (->) y su sintaxis es (par�metros->cuerpo de lammbda).
		
		// Crear una instancia de una clase an�nima que implemente nuestra
		// interface funcional
		IFuncional suma = (a,b) -> System.out.println("La suma es: " + (a+b));
		
		//No importa que en la interface haya llamado a los elementos a y b, al momento de utilizarlos 
		// puede referirlos con otras letras e incluso com items y funciona:
//		IFuncional suma = (x,y) -> System.out.println("La suma es: " + (x+y));
//		IFuncional suma = (item1,item2) -> System.out.println("La suma es: " + (item1+item2));
		
		//Ahora puedo utilizar el m�todo llamado operaci�n a traves del objeto suma
		suma.operacion(15, 2);
		
		//Ahora puedo crear un objeto llamado resta que implementar� la misma interface IFuncional
		IFuncional resta = (a,b) -> System.out.println("La resta es: " +(a-b));
		resta.operacion(12, 4);
		
		

	}

}
