package com;

public class estadocivil {

	private String soltero;
	private String casado;
	private String viudo;
	private String divorciado;
	
	public estadocivil() {}

	public estadocivil(String soltero, String casado, String viudo, String divorciado) {
		super();
		this.soltero = soltero;
		this.casado = casado;
		this.viudo = viudo;
		this.divorciado = divorciado;
	}

	public String getSoltero() {
		return soltero;
	}

	public void setSoltero(String soltero) {
		this.soltero = soltero;
	}

	public String getCasado() {
		return casado;
	}

	public void setCasado(String casado) {
		this.casado = casado;
	}

	public String getViudo() {
		return viudo;
	}

	public void setViudo(String viudo) {
		this.viudo = viudo;
	}

	public String getDivorciado() {
		return divorciado;
	}

	public void setDivorciado(String divorciado) {
		this.divorciado = divorciado;
	}

	@Override
	public String toString() {
		return "estadocivil [soltero=" + soltero + ", casado=" + casado + ", viudo=" + viudo + ", divorciado="
				+ divorciado + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
