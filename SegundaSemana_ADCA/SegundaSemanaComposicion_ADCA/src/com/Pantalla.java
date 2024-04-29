package com;

public class Pantalla {
	private double medida;
	private double resolucion;
	private double tipoPanel;
	
	public Pantalla() {
		
	}

	public Pantalla(double medida, double resolucion, double tipoPanel) {
		super();
		this.medida = medida;
		this.resolucion = resolucion;
		this.tipoPanel = tipoPanel;
	}

	public double getMedida() {
		return medida;
	}

	public void setMedida(double medida) {
		this.medida = medida;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public double getTipoPanel() {
		return tipoPanel;
	}

	public void setTipoPanel(double tipoPanel) {
		this.tipoPanel = tipoPanel;
	}

	@Override
	public String toString() {
		return "Pantalla [medida=" + medida + ", resolucion=" + resolucion + ", tipoPanel=" + tipoPanel + "]";
	}
	
}
