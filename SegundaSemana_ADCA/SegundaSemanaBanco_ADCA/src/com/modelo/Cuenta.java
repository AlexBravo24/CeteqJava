package com.modelo;

public class Cuenta {
	
	//en el paquete com.modelo guardamos la informacion
	//de los objetos o entidades a los cuales
	//queremos acceder
	//en este ejemplo necesitamos crear varias cuentas
	//del usuarios y las agregaremos a un HasMap para
	//simular una pequena BD
	
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saloMax;
	private String tipoCuenta;
	
	public Cuenta() {
		
	}

	public Cuenta(String usuario, double saldo, double saldoMin, double saloMax, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saloMax = saloMax;
		this.tipoCuenta = tipoCuenta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
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

	public double getSaloMax() {
		return saloMax;
	}

	public void setSaloMax(double saloMax) {
		this.saloMax = saloMax;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saloMax=" + saloMax
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	
	

}
