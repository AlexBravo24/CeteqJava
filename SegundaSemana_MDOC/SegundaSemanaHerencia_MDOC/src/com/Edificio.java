package com;

public class Edificio extends Departamentos {
	
	private int noDepartamentosPiso;
	private int noPisos;
	private int noSalasComunes;
	
	public Edificio () {
		
	}

	public Edificio(int noVentanas, int noPuertas, int noCuartos, int noDepartamentosPiso, int noPisos,
			int noSalasComunes) {
		super(noVentanas, noPuertas, noCuartos);
		this.noDepartamentosPiso = noDepartamentosPiso;
		this.noPisos = noPisos;
		this.noSalasComunes = noSalasComunes;
	}

	public int getNoDepartamentosPiso() {
		return noDepartamentosPiso;
	}

	public void setNoDepartamentosPiso(int noDepartamentosPiso) {
		this.noDepartamentosPiso = noDepartamentosPiso;
	}

	public int getNoPisos() {
		return noPisos;
	}

	public void setNoPisos(int noPisos) {
		this.noPisos = noPisos;
	}

	public int getNoSalasComunes() {
		return noSalasComunes;
	}

	public void setNoSalasComunes(int noSalasComunes) {
		this.noSalasComunes = noSalasComunes;
	}

	@Override
	public String toString() {
		return "Edificio \n [Número de Departamentos por Piso=" + noDepartamentosPiso + ", \n Número de Pisos=" + noPisos + ", \n Número de Salas Comunes="
				+ noSalasComunes + ", \n" + super.toString() + "]";
	}
	
	

}
