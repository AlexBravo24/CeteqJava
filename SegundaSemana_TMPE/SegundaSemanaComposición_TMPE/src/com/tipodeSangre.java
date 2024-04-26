package com;

public class tipodeSangre {
	
	private String clinica;
	private int numero_de_muestra;
	private int etiqueta;
	
	public tipodeSangre() {}

	public tipodeSangre(String clinica, int numero_de_muestra, int i) {
		super();
		this.clinica = clinica;
		this.numero_de_muestra = numero_de_muestra;
		this.etiqueta = i;
	}

	public String getClinica() {
		return clinica;
	}

	public void setClinica(String clinica) {
		this.clinica = clinica;
	}

	public int getNumero_de_muestra() {
		return numero_de_muestra;
	}

	public void setNumero_de_muestra(int numero_de_muestra) {
		this.numero_de_muestra = numero_de_muestra;
	}

	public int getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(int etiqueta) {
		this.etiqueta = etiqueta;
	}

	@Override
	public String toString() {
		return "tipodeSangre [clinica=" + clinica + ", numero_de_muestra=" + numero_de_muestra + ", etiqueta="
				+ etiqueta + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	}


