package com;

import java.util.HashMap;
import java.util.Map;

import com.logia.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		
		// Creamos la base de datos
		
		//Declaramos el HashMap
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		
		//Para agregar cuentas en el HashMap podemos hacerlo de dos formas
		
		//Crear cuenta y agregarla despues
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito");
		
		cuentas.put(1001, alex);
		
		//Creando cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
		//Si nos acordamos para recuperar el valor de objeto en mi HashMap
		//System.out.println(cuentas.get(1003));
		
		//Creamos el nuevo cajero
		Cajero angelopolis=new Cajero("Angelopolis", cuentas);
		
		
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		
		
		
		
		//Probando el metodo retirar exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//probar metodo con saldo insuficiente
		System.out.println(angelopolis.retirar(1004, 1000));

		//Quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));
		
		
		
		
		
		//Probando metodo de depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		System.out.println(angelopolis.depositar(1003, 10000));
		System.out.println(angelopolis.depositar(1003, 100));
		
	}

}
