package com;

public class Persona1 {
	private int id;
	private String nombre;
	private int edad;
	
	private  nacionalidad  nac;
	private  tipodeSangre  tps;
	private  estadocivil    ec;
	

	public Persona1() {}


	public Persona1(int id, String nombre, int edad, nacionalidad nac, tipodeSangre tps, estadocivil ec) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.nac = nac;
		this.tps = tps;
		this.ec = ec;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public nacionalidad getNac() {
		return nac;
	}


	public void setNac(nacionalidad nac) {
		this.nac = nac;
	}


	public tipodeSangre getTps() {
		return tps;
	}


	public void setTps(tipodeSangre tps) {
		this.tps = tps;
	}


	public estadocivil getEc() {
		return ec;
	}


	public void setEc(estadocivil ec) {
		this.ec = ec;
	}


	@Override
	public String toString() {
		return "Persona1 [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", nac=" + nac + ", tps=" + tps
				+ ", ec=" + ec + "]";
	}

	
	
	
	
	
	
	
	
	}

	
	
	
	


