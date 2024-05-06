package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		// vamos a crear nuestra base da datos o sea un HashMap
		
		//Declaramos nuestro HashMap
		Map <Integer, Cuenta> cuentas = new HashMap <Integer, Cuenta> ();
		
		// Para agregar cuenta en nuestro HashMap podemos hacerlo de dos formas:
		// 1.- creando la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta ("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		// 2.- creando las cuentas directamente en el HashMap
		
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		// Si nos acrodamos, para recuperar el valor de un objeto en mi HashMap
//		System.out.println(cuentas.get(1003));
		
		// Crear mi nuevo cajero
		
		Cajero angelopolis = new Cajero ("Angelopolis", cuentas);
		
		// Probar el m�todo consultar
//		System.out.println(angelopolis.consultar(1003));  // esta cuenta si existe
//		System.out.println(angelopolis.consultar(1006)); // esta cuenta no existe
		
		// Probar el metodo retirar exitoso
//		System.out.println(angelopolis.retirar(1001, 8000));
		
		// Probar el metodo retiro  no existoso
//		System.out.println(angelopolis.retirar(1001, 10000));
		
		// Probar retirar de una cuenta que no existe
//		System.out.println(angelopolis.retirar(1006, 12000));
		
		// Probar el metodo deposito exitoso
		System.out.println(angelopolis.depositar(1003, 2000));
		
		// Probar el metodo deposito no exitoso
		System.out.println(angelopolis.depositar(1003, 15000));
		
		// Probar el depositar a una cuenta que no existe
		System.out.println(angelopolis.depositar(1008, 2000));
		
	}

}
