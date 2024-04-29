package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	//Contiene una lista de metodos abstractos
	//Aqui declaramos las operaciones que la clase encargada
	//de la logica tendrá que resolver
	
	//Consultar una cuenta de banco, o cuenta existente
	public Cuenta consultar(int numeroCuenta);
	
	//Retirar recursos de nuestra cuenta
	public Ticket retirar(int numeroCuenta, double monto);
	
	//Despositar recursos de nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);

}
