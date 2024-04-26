package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {

	// Aqu� declaramos las operaciones que la clase encargada de la logica tendra
	// que resolver

	// Consultar una cuenta de banco
	public Cuenta consultar(int numeroCuenta);

	// Retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);

	// Depositar recursos de nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);

}
