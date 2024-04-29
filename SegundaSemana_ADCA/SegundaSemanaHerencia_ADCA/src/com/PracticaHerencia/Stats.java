package com.PracticaHerencia;

public class Stats {
	private int bb;
	private int h;
	private int h2;
	private int h3;
	private int hr;
	
	public Stats() {
		
	}

	public Stats(int bb, int h, int h2, int h3, int hr) {
		super();
		this.bb = bb;
		this.h = h;
		this.h2 = h2;
		this.h3 = h3;
		this.hr = hr;
	}

	public int getBb() {
		return bb;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getH2() {
		return h2;
	}

	public void setH2(int h2) {
		this.h2 = h2;
	}

	public int getH3() {
		return h3;
	}

	public void setH3(int h3) {
		this.h3 = h3;
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	@Override
	public String toString() {
		return "Stats [bb=" + bb + ", h=" + h + ", h2=" + h2 + ", h3=" + h3 + ", hr=" + hr + "]";
	}
	
	
	

}
