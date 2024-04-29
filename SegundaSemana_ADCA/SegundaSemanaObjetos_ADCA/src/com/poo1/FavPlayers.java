package com.poo1;

public class FavPlayers {
	
	private String nombre;
	private String equipo;
	private int numeroJersey;
	private int homeRuns;
	private double avg;
	
	public FavPlayers() {
		
	}

	public FavPlayers(String nombre, String equipo, int numeroJersey, int homeRuns, double avg) {
		super();
		this.nombre = nombre;
		this.equipo = equipo;
		this.numeroJersey = numeroJersey;
		this.homeRuns = homeRuns;
		this.avg = avg;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getNumeroJersey() {
		return numeroJersey;
	}

	public void setNumeroJersey(int numeroJersey) {
		this.numeroJersey = numeroJersey;
	}

	public int getHomeRuns() {
		return homeRuns;
	}

	public void setHomeRuns(int homeRuns) {
		this.homeRuns = homeRuns;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "FavPlayers [nombre=" + nombre + ", equipo=" + equipo + ", numeroJersey=" + numeroJersey + ", homeRuns="
				+ homeRuns + ", avg=" + avg + "]";
	}
	
	


}
