package com;

public class nacionalidad {
	
	private String ciudad;
	private int cp;
	private String pais;
	
	public nacionalidad() {}

	public nacionalidad(String ciudad, int cp, String pais) {
		super();
		this.ciudad = ciudad;
		this.cp = cp;
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "nacionalidad [ciudad=" + ciudad + ", cp=" + cp + ", pais=" + pais + "]";
	}

	

	

}
