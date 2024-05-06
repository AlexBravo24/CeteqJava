package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	
	// Aqui declaramos las operaciones que la clase encargada de la l�gica
	// tendra que resolver
	
	// Consultar una cuenta de banco
	public Cuenta consultar (int numeroCuenta); // Import� Cuenta del paquete com.modelo

	// Retirar recursos de nuestra cuenta
	public Ticket retirar (int numeroCuenta, double monto); // Importe Ticket de paquete com.respuesta

	// Depositar recursos en nuestra cuenta
	public Ticket depositar (int numeroCuenta, double monto);

	
}
