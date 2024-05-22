package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		
		//base de datos
		Map<Integer, Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		//Añadir cuentas al Hash
		Cuenta alex= new Cuenta("Alex", 13000, 4000,50000, "Debito");
		cuentas.put(1001, alex);
		
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 15000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 1000, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo", 500, 100, 10000, "Debito"));
		
//		System.out.println(cuentas.get(1003));
		
		Cajero angelopolis = new Cajero ("Angelopolis", cuentas);
		//Método consultar
		System.out.println(angelopolis.consultar(1001));
		
		//Método retirar
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		System.out.println(angelopolis.retirar(1006, 1000));
		
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Método depositar
		System.out.println(angelopolis.depositar(1001, 5000));
		System.out.println(angelopolis.depositar(1003, 1100));
		
		

	}

}
