package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	//En el paquete com.loguica se encuentra la clase
	//encargada de resolver las operaciones
	
	//Vamos a declarar unos atribuos de nuestto cajero
	private String sucursal;
	private Map<Integer,Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar
	//el folio en nuestro ticket
	private int folio=1;
	
	public Cajero() {
		
	}

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta=null;
		//Entonces asignamos posteriormente la cuenta si exite en el hash map
		cuenta=cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket=null;
		
		//Vamos a buscar la cuenta y necesitamos hacer unas validaciones
		//Si se encuentra o lovaliza la cuenta la asignamos para manipularla
		if(consultar(numeroCuenta)!=null) {
			Cuenta cuenta=consultar(numeroCuenta);
			//una vez localizamos la cuenta
			//realizamos las siguientes operaciones
			if(monto>9000) {//validamos si el monto excede el maximo del cajero
				System.out.println("El monto excede el máximo permitido por el cajero");
				return ticket;

			}else if(cuenta.getSaldo()<monto) {//si el saldo es menor al monto a retirar
				System.out.println("Saldo insuficiente para retiro");
				return ticket;
			}else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket;
			}else {//si el retiro puede realizarse
				//Actualizamos el saldo de la cuentaa
				cuenta.setSaldo(cuenta.getSaldo()-monto);//realizamos el retiro
				//Entonces emitimos un nuevo ticket
				ticket=new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("NO existe una cuenta asociada a ese cliente");
			return ticket;

		}
		
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket=null;
		
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			if(monto>cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el maximo permitido");
				return ticket;
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El sldo excederia el maximo permitido en la cunenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket=new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
			}else {
				System.out.println("No hay una cuenta asociada a ese cliente");
				return ticket;
		}
	}
}
