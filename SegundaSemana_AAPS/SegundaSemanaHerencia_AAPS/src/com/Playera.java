package com;

public class Playera {

	private String color;
	private String talla;
	private int codigo;
	
	public Playera () {
		
	}

	public Playera(String color, String talla, int codigo) {
		super();
		this.color = color;
		this.talla = talla;
		this.codigo = codigo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Playera [color=" + color + ", talla=" + talla + ", codigo=" + codigo + "]";
	}
	
	
}
