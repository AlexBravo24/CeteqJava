package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	// En el paquete com.l�gica se encuentra la clas enecargada de resolver
	// las operaciones
	
	//Vamos a declarar unos atributos de nuestro cajero
	private String sucursal;
	private Map <Integer, Cuenta> cuentas;
	
	//Vamos a declarar una variable auxilicar para incrementar el folio en nuestro ticket
	private int folio = 1;

	public Cajero () {
	}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		//Necesitamos crear una cuenta vacia inicalmente
		Cuenta cuenta = null;
		
		//Aginamos posteriormente la cuenta si exsite en el HashMap
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		// Necestiamos crear un ticket vacio inicialmente
		Ticket ticket = null;
		
		// Vamos a buscar la cuenta y necesitamos hacer unas validaciones.
		// Primero, si se encuentra o localizar la cuenta, la asignamos para manipularla
		
		if (consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar (numeroCuenta);
			// Una vez localizamos la cuenta para manipular, realizamos ciertas validaciones
			if (monto>9000) { // validamos si el monto excede el maximo del cajero
				System.out.println("El monto excede el m�ximo permitido por el cajero.");
				return ticket;
			} else if (cuenta.getSaldo()<monto) { // Si el saldo es menor al monto a retirar
				System.out.println("El saldo de tu cuenta es insuficiente para realizar el retiro.");
				return ticket;
			} else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del m�nimo a la cuenta.");
				return ticket;
			} else { // si el retiro puede realizarse actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto); // realizamos el retiro
				// entonces como la operaciones es exitosa, retornamos un nuevo ticekt3
				ticket = new Ticket (folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			} 
		} else {
			System.out.println("No existe una cuenta asociada a ese cliente.");
			return ticket;
		}
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		if (consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el m�ximo permitido en la cuenta.");
				return ticket;
			} else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo excederia el m�ximo permitido en la cuenta.");
				return ticket;
			} else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket (folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} else {
				System.out.println("No hay una cuenta asociada a ese cliente.");
				return ticket;
			}
	}
}
