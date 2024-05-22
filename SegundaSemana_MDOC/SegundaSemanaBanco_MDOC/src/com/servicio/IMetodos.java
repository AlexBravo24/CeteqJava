package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	// Consultar cuenta
	public Cuenta consultar(int numeroCuenta);

	// Retirar recurso
	public Ticket retirar(int numeroCuenta, double monto);

	// Ingresar recurso
	public Ticket depositar(int numeroCuenta, double monto);
	
	

}
