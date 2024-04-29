package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear nuestra base de datos
		
		//Declaramos nuestro HashMap
		Map<Integer,Cuenta> cuentas=new HashMap<Integer,Cuenta>();
		
		//para agregar cuentas en nuestro HashMap podemos hacerlo de dos formas
		//creando la cuenta y agregandolo despues
		Cuenta alex=new Cuenta("Alex",13000,4000,50000,"Debito");
		cuentas.put(1001, alex);
		
		//Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice",1000,100,15000,"Debito"));
		cuentas.put(1003, new Cuenta("Humberto",5000,500,55000,"Debito"));
		cuentas.put(1004, new Cuenta("Pablo",8000,800,18000,"Debito"));

		//Para recuperar un objeto en mi HashMao
		//System.out.println(cuentas.get(1003));
		
		//Crear mi nuevo cajero
		Cajero angelopolis=new Cajero("Angelopolis",cuentas);
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001));
		
		//Probar el metodo retirar
		System.out.println(angelopolis.retirar(1001, 8000));
		
		//ueiro retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1006, 1000));
		
		//Retirar mas del saldo
		System.out.println(angelopolis.retirar(1003, 6000));
		
		//Probar el metodo depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
		
		System.out.println(angelopolis.depositar(1003, 550000));
	}

}
