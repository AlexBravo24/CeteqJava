package com;

public class Bottom {

	private String marca;
	private String color;
	private String talla;
	
	private Corte ct;
	private Cierre cr;
	private Tipo tp;
	
	public Bottom () {
	}

	public Bottom(String marca, String color, String talla, Corte ct, Cierre cr, Tipo tp) {
		super();
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.ct = ct;
		this.cr = cr;
		this.tp = tp;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public Corte getCt() {
		return ct;
	}

	public void setCt(Corte ct) {
		this.ct = ct;
	}

	public Cierre getCr() {
		return cr;
	}

	public void setCr(Cierre cr) {
		this.cr = cr;
	}

	public Tipo getTp() {
		return tp;
	}

	public void setTp(Tipo tp) {
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "Bottom [marca=" + marca + ", \n color=" + color + ", \n talla=" + talla + ", \n ct=" + ct + ", \n cr=" + cr
				+ ", \n tp=" + tp + "]";
	}
	
	

}
