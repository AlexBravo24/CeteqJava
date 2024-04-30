package com.logia;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{

	//Ene le paquete com.logica se encuentra la clase encargada de resolver las operaciones
	
	//vamos a declarar unos atributos de nuestrop cajero
	private String sucursal;
	private Map<Integer, Cuenta> cuentas;
	
	//Declarar una variable auxiliar para incrementar el folio en el ticket
	private int folio=1;
	
	public Cajero() {}
	
			
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	


	@Override
	public Cuenta consultar(int numeroCuenta) {
		// Necesitamos crear una cuenta vacia inicialmente
		Cuenta cuenta =null;
		
		//Entonces asignamos posteriormente la cuenta si existe en el HashMap
		cuenta =cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		//vamos a buscar la cuenta y necesitamos hacer unas validaciones
		//Primero si se encuentra o locaiza la cuenta la asignamos para manipularla
		if (consultar (numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			
		//una vez localizada la cuenta para manipular realizamos ciertas validaciones
			if(monto>9000) { //validamos si el monto excede el mximo permitido del cajero
				System.out.println("El monto excede el maximo permitido");
				return ticket;
			}else if (cuenta.getSaldo()<monto) { // Si el saldo es menor al monto a retirar
				System.out.println("Saldo insuficiente para realizar el retiro");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El reiro dejaria por debajo del minimo de la cuenta");
				return ticket;
			}else { //Si el retiro puede realizarse actualizamos el saldo de la cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto); //realizamos el retiro
				//entonces ahora si eminitimos el nuevo ticket
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
					
		}else {
		System.out.println("No existe una cuenta asociada a ese cliente");
		return ticket; }
	}

	
	
	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		
		if (consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
			}else if (cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo excederia el maximo permitido en la cuenta");
				return ticket;
			} else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		 
		
	}
	
	
	
	
	
	
	

}
