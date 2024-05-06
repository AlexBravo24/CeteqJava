package com;

public class Tipo {

	private String longitud;
	private String ventilacion;
	
	public Tipo () {
	}

	public Tipo(String longitud, String ventilacion) {
		super();
		this.longitud = longitud;
		this.ventilacion = ventilacion;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getVentilacion() {
		return ventilacion;
	}

	public void setVentilacion(String ventilacion) {
		this.ventilacion = ventilacion;
	}

	@Override
	public String toString() {
		return "Tipo [longitud=" + longitud + ", ventilacion=" + ventilacion + "]";
	}
	
	
}
