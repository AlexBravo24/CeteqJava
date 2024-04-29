package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {
	
	//en el paquete com.logica se encuentra la clase 
	//encargada de resolver las operaciones
	
	//vamos a declarar unos atributos de nuestro cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar 
	//el folio en nuestro ticket
	private int folio = 1;
	
	public Cajero( ) {
		
	}   
	
	

	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	@Override
	public Cuenta consultar(int numeroCuenta) {
		// necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta = null;
		
		//entonces asignamos posterirormente la cuenta si existe en el HashMap
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		
		
		Ticket ticket = null;
		//vamos a buscar la cuenta y necesitamos hacer unas validaciones
		//primero, si se encuentra o localiza la cuenta, la sognamos
		//para manipular
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			
			//una vez localizamos la cuenta parea minipular
			//realizamos ciertas validaciones
			if (monto>9000) { //validamos si el monto excede el maximo del cajero
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket;
			}else if(cuenta.getSaldo() < monto) { //si el saldo es menor al monto a retirar
				System.out.println("Saldo insuficiente para realizar retiro");
				return ticket;
				
			}else if(cuenta.getSaldo()- monto < cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
			}else { //si el retiro puede realizarse
				//actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo() - monto); //realizamos el retiro
				//entonces ahora si emitimos un nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
				
			}
		}else {
		System.out.println("No existe una  cuenta asociada a ese cliente");
		return ticket;
		}
		return ticket;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if(consultar(numeroCuenta) != null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//validaciones
			if(monto > cuenta.getSaloMax()) {
				System.out.println("El monto a depositar excede el maximo permitidoen la cuenta");
				return ticket;
				
			}else if (cuenta.getSaldo() + monto > cuenta.getSaloMax()) {
				
				System.out.println("el saldo excederia el maximo permitido en la cuenta");
				return ticket;
				
			}else {
				cuenta.setSaldo(cuenta.getSaldo() + monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
		
	}
	
	

}
