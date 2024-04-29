package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// vamos a crear nuestra base de datos
		
		// declaramos nuestro HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//para agregar cuentas en nuestro HashMap podemos hacerlo de dos
		//formas
		//cuando la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 5000, "Debito");
		
		cuentas.put(1001, alex);
		
		//creando las cuentas directamente en el HashMap
		
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//si nos acordamos, para recuperar el valor de un objeto en mis HashMap
		//System.out.println(cuentas.get(1003));
		
		//crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//probar el metodo consultar
		System.out.println(angelopolis.consultar(1006));
		
		//probar el metodo retir exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//probar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 10000));
		System.out.println(angelopolis.depositar(1003, 100));
		
		
	}

}
