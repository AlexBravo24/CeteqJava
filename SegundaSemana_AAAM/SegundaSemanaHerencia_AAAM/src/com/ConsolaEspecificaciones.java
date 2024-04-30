package com;

public class ConsolaEspecificaciones extends Consola{

	private String cpu;
	private String gpu;
	private String memoria;
	
	public ConsolaEspecificaciones() {}

	public ConsolaEspecificaciones(String marca, String nombre, double precio, String cpu, String gpu, String memoria) {
		super(marca, nombre, precio);
		this.cpu = cpu;
		this.gpu = gpu;
		this.memoria = memoria;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "ConsolaEspecificaciones [cpu=" + cpu + ", gpu=" + gpu + ", memoria=" + memoria + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
