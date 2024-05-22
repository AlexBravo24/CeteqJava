package com;

public class Departamentos {

	private int noVentanas;
	private int noPuertas;
	private int noCuartos;
	
	public Departamentos () {
		
	}

	public Departamentos(int noVentanas, int noPuertas, int noCuartos) {
		super();
		this.noVentanas = noVentanas;
		this.noPuertas = noPuertas;
		this.noCuartos = noCuartos;
	}

	public int getNoVentanas() {
		return noVentanas;
	}

	public void setNoVentanas(int noVentanas) {
		this.noVentanas = noVentanas;
	}

	public int getNoPuertas() {
		return noPuertas;
	}

	public void setNoPuertas(int noPuertas) {
		this.noPuertas = noPuertas;
	}

	public int getNoCuartos() {
		return noCuartos;
	}

	public void setNoCuartos(int noCuartos) {
		this.noCuartos = noCuartos;
	}

	@Override
	public String toString() {
		return "Departamentos [No. Ventanas=" + noVentanas + ", \n No. Puertas=" + noPuertas + ", \n No. Cuartos=" + noCuartos
				+ "]";
	}
	

}
