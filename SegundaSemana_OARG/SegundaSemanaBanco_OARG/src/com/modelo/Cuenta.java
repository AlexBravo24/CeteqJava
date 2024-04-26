package com.modelo;

public class Cuenta {
	
	//EN el paquete com.modelo guardamos la información de los objetos o entiendades a los cuales
	//queremos accedder
	//En este ejemplo necesitamos crear varias cuentas de usuarios y las agregaremos a un 
	//HashMap para simular una pequeña BD
	
	private String usario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipoCuenta;
	
	public Cuenta() {}

	public Cuenta(String usario, double saldo, double saldoMin, double saldoMax, String tipoCuenta) {
		super();
		this.usario = usario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipoCuenta = tipoCuenta;
	}

	public String getUsario() {
		return usario;
	}

	public void setUsario(String usario) {
		this.usario = usario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldoMin() {
		return saldoMin;
	}

	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}

	public double getSaldoMax() {
		return saldoMax;
	}

	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usario=" + usario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	
}
