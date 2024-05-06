package com;

public class Corte {

	private String estilo;
	private String edad;
	
	public Corte () {
	}

	public Corte(String estilo, String edad) {
		super();
		this.estilo = estilo;
		this.edad = edad;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Corte [estilo=" + estilo + ", edad=" + edad + "]";
	}
	
	
}
