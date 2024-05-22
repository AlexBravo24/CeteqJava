package com;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*Expresiones o Funciones Lambda
		 * son expresiones o funciones anónimas que implementan una
		 * interface funcional, lo que permite definir ese método para su uso inmediato
		 * sin necesidad de crear una clase que lo defina
		 * 
		 * Su operador es ->
		 * su sintaxis es (Parámetros) -> {(cuerpo de lambda)};
		 * 
		 * Crear una instancia de una clase anónima, que implemente
		 * nuestra interface funcional 		 */
		
		IFuncional suma = (a,b) -> JOptionPane.showMessageDialog(null, "La suma es: " +(a+b));
		
		//Puedo utilizar el método llamado operación, a través del objeto suma
		suma.operacion(19, 2);
		

		IFuncional resta = (a,b) -> JOptionPane.showMessageDialog(null, "La resta es: " +(a-b));
		
		//Puedo utilizar el método llamado operación, a través del objeto suma
		resta.operacion(19, 2);
		
		

	}

}
