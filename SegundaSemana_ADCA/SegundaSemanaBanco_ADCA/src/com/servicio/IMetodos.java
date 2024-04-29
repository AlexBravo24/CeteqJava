package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//aque declaramos todas las operaciones que
	//la clase encargada de la logica
	//tendra que resolver
	
	//consultar una cuenta de banco
	public Cuenta consultar(int numeroCuenta);
	
	//retirar recursos de nuestra cuenta
	
	public Ticket retirar(int numeroCuenta, double monto);
	
	//depositar recursos de nuestra cuenta
	
	public Ticket depositar(int numeroCuenta, double monto);

}
