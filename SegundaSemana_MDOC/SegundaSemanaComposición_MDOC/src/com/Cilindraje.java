package com;

public class Cilindraje {
	
	private String altoobajo;
	private int cc ;
	
	public Cilindraje () {
		
	}

	public Cilindraje(String altoobajo, int cc) {
		super();
		this.altoobajo = altoobajo;
		this.cc = cc;
	}

	public String getAltoobajo() {
		return altoobajo;
	}

	public void setAltoobajo(String altoobajo) {
		this.altoobajo = altoobajo;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Cilindraje [altoobajo=" + altoobajo + ", cc=" + cc + "]";
	}
	
	


}
